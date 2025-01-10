/*
 * Copyright (c) 2021, Oracle and/or its affiliates. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tribuo.interop.onnx.extractors;

import ai.onnxruntime.OrtException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tribuo.Feature;
import org.tribuo.classification.Label;
import org.tribuo.classification.LabelFactory;
import org.tribuo.util.embeddings.BERTTokenizerConfig;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BERTFeatureExtractorTest {

    @Test
    public void testTokenizerLoading() throws URISyntaxException, IOException {
        Path vocabPath = Paths.get(BERTFeatureExtractorTest.class.getResource("bert-base-cased-vocab.txt").toURI());
        Path tokenizerPath = Paths.get(BERTFeatureExtractorTest.class.getResource("bert-base-cased-tokenizer.json").toURI());
        BERTTokenizerConfig config = BERTTokenizerConfig.loadTokenizer(tokenizerPath);

        List<String> vocabList = Files.readAllLines(vocabPath, StandardCharsets.UTF_8);

        Assertions.assertEquals(config.tokenIDs().size(),vocabList.size());

        for (String vocabElement : vocabList) {
            Assertions.assertTrue(config.tokenIDs().containsKey(vocabElement));
        }

        Assertions.assertEquals(100, config.maxInputCharsPerWord());
        Assertions.assertEquals(false, config.lowercase());
        Assertions.assertEquals(false, config.stripAccents());
        Assertions.assertEquals("[UNK]",config.unknownToken());
        Assertions.assertEquals("[CLS]",config.classificationToken());
        Assertions.assertEquals("[SEP]",config.separatorToken());

        tokenizerPath = Paths.get(BERTFeatureExtractorTest.class.getResource("tinybert-tokenizer.json").toURI());
        config = BERTTokenizerConfig.loadTokenizer(tokenizerPath);
        Assertions.assertEquals(100, config.maxInputCharsPerWord());
        Assertions.assertEquals(true, config.lowercase());
        Assertions.assertEquals(true, config.stripAccents());
        Assertions.assertEquals("[UNK]",config.unknownToken());
        Assertions.assertEquals("[CLS]",config.classificationToken());
        Assertions.assertEquals("[SEP]",config.separatorToken());
    }

    @Test
    public void testEmbedding() throws URISyntaxException, OrtException {
        // tinybert's vocab is build on the first seven chapters of Pride and Prejudice from project gutenberg
        // and has 1656 elements.
        Path tokenizerPath = Paths.get(BERTFeatureExtractorTest.class.getResource("tinybert-tokenizer.json").toURI());
        /* tinybert is untrained, built with the following config
        config = BertConfig(
                vocab_size=tokenizer.vocab_size,
                hidden_size=50,
                num_hidden_layers=1,
                num_attention_heads=1,
                intermediate_size=200,
                max_position_embeddings=100
        )
        */
        Path modelPath = Paths.get(BERTFeatureExtractorTest.class.getResource("tinybert.onnx").toURI());
        LabelFactory factory = new LabelFactory();
        String input = "It is a truth universally acknowledged,";

        // Note for some reason with ORT 1.7.0 and Huggingface Transformers 4.3.3 the outputs
        // of ORT (which are the same in both Python and Java) differ slightly from the outputs
        // of Huggingface on this specific model.

        // Test CLS token embedding
        try (BERTFeatureExtractor<Label> extractor = new BERTFeatureExtractor<>(factory,modelPath,tokenizerPath,50,BERTFeatureExtractor.OutputPooling.POOLER,512,false)) {
            List<String> tokens = extractor.getInputProcessor().tokenize(input);

            // Check we got the right number of tokens
            Assertions.assertEquals(11, tokens.size());

            List<Feature> clsEmbedding = extractor.process("", input);
            double[] clsEmbeddingArr = clsEmbedding.stream().mapToDouble(Feature::getValue).toArray();
            double[] expectedCLS = new double[]{-0.09987275302410126, -0.08381578326225281, -0.17915815114974976, 0.1595402956008911, 0.12995541095733643, 0.02285454422235489, 0.16443753242492676, -0.05802210792899132, 0.25674450397491455, -0.09596416354179382, 0.08692581206560135, -0.17145220935344696, 0.05614880844950676, 0.14230673015117645, 0.09240773320198059, 0.03262120857834816, 0.05173583701252937, 0.3492385447025299, -0.010329307056963444, 0.22916817665100098, 0.1269291639328003, 0.033620379865169525, 0.12352693825960159, 0.0520106665790081, -0.012766036204993725, 0.029396483674645424, -0.09637446701526642, 0.1646318882703781, -0.08488218486309052, -0.11151651293039322, -0.14075034856796265, -0.1965598613023758, -0.25300613045692444, 0.1736740618944168, 0.19785678386688232, -0.07669950276613235, 0.03425660356879234, 0.15457485616207123, 0.005061550531536341, 0.09869188815355301, -0.06988175213336945, -0.1692686229944229, -0.03754367679357529, -0.18752126395702362, -0.2161409854888916, -0.23712319135665894, 0.03122984990477562, 0.2796807289123535, -0.19152438640594482, -0.16166169941425323};
            Assertions.assertArrayEquals(expectedCLS,clsEmbeddingArr,1e-7);
        }

        // Test average token embedding
        try (BERTFeatureExtractor<Label> extractor = new BERTFeatureExtractor<>(factory,modelPath,tokenizerPath,50,BERTFeatureExtractor.OutputPooling.MEAN,512,false)) {
            List<Feature> aveEmbedding = extractor.process("", input);
            double[] aveEmbeddingArr = aveEmbedding.stream().mapToDouble(Feature::getValue).toArray();

            double[][] expectedTokens = new double[][]
                    {{0.15068432688713074, 1.291318655014038, -1.2186375856399536, -0.1044885441660881, -0.4916091561317444, 0.3050057888031006, 0.02411005087196827, 0.6914452314376831, -0.9399610161781311, 0.27564719319343567, 0.3189747631549835, -1.7623217105865479, 1.0957914590835571, -0.5502046346664429, 0.9324173927307129, -1.5440735816955566, -0.6300070285797119, 0.16870944201946259, -0.23421932756900787, 1.5419358015060425, 0.8080865144729614, 0.025547025725245476, 0.8078239560127258, -0.393135666847229, 0.7077765464782715, -0.9835149645805359, 1.161102294921875, 1.3422735929489136, -0.22637833654880524, 1.3680726289749146, -0.5111463069915771, -0.5181847810745239, 1.517228364944458, -1.2042882442474365, 0.8298169374465942, -1.6887481212615967, 1.2908772230148315, -0.5774198174476624, 1.1692675352096558, -0.14680930972099304, 0.8950840830802917, -0.5876469016075134, -0.19654417037963867, 0.5392388105392456, -1.7276521921157837, -0.611663281917572, -0.16960109770298004, -0.049318667501211166, -3.06258487701416, 0.8719245195388794},
                            {1.0965361595153809, -1.1880749464035034, 0.3113195300102234, -0.3655802607536316, -1.5703083276748657, -1.1889897584915161, 0.7478023171424866, -0.39957600831985474, -1.3990098237991333, -0.8826226592063904, 0.9648794531822205, -1.6420735120773315, 0.024305380880832672, 0.24259810149669647, 1.059976577758789, -1.037889838218689, 0.26438167691230774, 0.6861287355422974, 0.5879555940628052, 0.24698519706726074, 1.4645506143569946, -0.006917477119714022, 1.4397014379501343, 1.1548478603363037, 0.6714677214622498, 0.6217436790466309, 0.9137017130851746, 1.1192125082015991, -0.3414439857006073, 0.35929620265960693, -0.33042025566101074, 1.302490234375, 0.9483469724655151, -0.8030039668083191, -0.703107476234436, -1.240598201751709, 0.8048795461654663, 0.6972590088844299, -0.7481553554534912, -1.8371062278747559, 0.3635812997817993, 1.581039547920227, -2.5392677783966064, 0.9263530373573303, -1.9384249448776245, -0.011463197879493237, 0.07263753563165665, -0.3027907609939575, -0.09641885757446289, -0.10073360800743103},
                            {-1.8009929656982422, 1.7652853727340698, -1.0941085815429688, 0.7871851325035095, 0.4216032326221466, -1.0672706365585327, -0.8045699596405029, 0.9037136435508728, -2.143636465072632, -0.15777075290679932, 0.8275935649871826, -1.1132452487945557, -0.6541622877120972, 0.07551676779985428, 0.05679287016391754, -0.2197706550359726, -1.9069557189941406, -0.4351661801338196, 1.4026257991790771, 0.8644767999649048, -0.4851606786251068, 1.1354173421859741, 1.2878172397613525, -0.3415570855140686, 0.987838089466095, -0.5241823196411133, 1.1697313785552979, 1.0625451803207397, 1.6975505352020264, -0.3230779767036438, -0.5761590003967285, 0.603135883808136, -0.2959841191768646, 0.3705970048904419, 0.21842513978481293, 0.26845696568489075, 1.1077520847320557, 1.4424563646316528, 0.4948478937149048, -1.5140318870544434, -0.18938101828098297, -0.7575010657310486, -0.7218572497367859, 0.7249206304550171, -1.6331541538238525, -0.8491988182067871, -1.0908783674240112, 1.3952903747558594, 0.2033471167087555, -0.5751500129699707},
                            {0.4679090082645416, 0.07996948063373566, -1.6602343320846558, 0.20126283168792725, 0.06442692875862122, -0.08430163562297821, -0.7668660283088684, 0.7862005829811096, -1.517468810081482, 0.6565523147583008, 0.5232337117195129, -0.4334183931350708, -0.9862611889839172, 0.38712450861930847, 0.0734504759311676, 0.6105567812919617, 0.2887442409992218, -1.2738916873931885, -0.6189880967140198, -0.43752387166023254, 0.2172611504793167, -1.9195876121520996, 1.0163580179214478, -0.5466981530189514, 0.42114630341529846, 2.586289644241333, -1.0503790378570557, 0.5456677079200745, -0.2378668189048767, -0.9922659993171692, 0.15639954805374146, 0.8844059705734253, 0.9527930617332458, 0.22640955448150635, 1.870503544807434, 0.43025293946266174, 1.041293978691101, 1.3405168056488037, 0.3268677890300751, -1.6156721115112305, -1.0111846923828125, 1.5576460361480713, -1.6189697980880737, 1.4933661222457886, -1.9079337120056152, -0.8028690218925476, 0.37441205978393555, -0.5571766495704651, 0.5627382397651672, -0.10420186072587967},
                            {-1.9169484376907349, -2.682704210281372, 0.5323475003242493, 0.323544442653656, 0.5599474310874939, 0.8109522461891174, 0.874146580696106, 0.8635344505310059, -1.7794417142868042, 0.1830170750617981, -0.30078354477882385, -1.4007086753845215, 0.11536423116922379, 2.058515787124634, 1.2980265617370605, -0.26386335492134094, -0.9431896209716797, 0.6774272322654724, 0.1838160753250122, 0.6408257484436035, -0.28405261039733887, -1.5093880891799927, -0.5268791317939758, -1.393326759338379, 0.32029837369918823, 1.4354349374771118, 0.17443843185901642, 0.681001603603363, -0.34653395414352417, 0.7144835591316223, 0.36404064297676086, -0.4427735507488251, 0.9191749095916748, -0.441799134016037, 0.7796847224235535, -0.8655410408973694, 1.3878437280654907, -0.8746767640113831, 1.1680442094802856, -0.6320986151695251, 0.1265067160129547, 1.5239441394805908, 0.06903105229139328, 0.39993590116500854, -0.24691283702850342, -1.212052345275879, 1.1660674810409546, -0.46258115768432617, -1.5795762538909912, -0.24556468427181244},
                            {1.169201135635376, -0.6180689930915833, -1.2667185068130493, 0.1621074080467224, -0.825954258441925, 1.011772871017456, 0.08253408223390579, 0.16792099177837372, -1.3966248035430908, 1.5229543447494507, -0.9187943339347839, -1.4296988248825073, -1.2473783493041992, 0.33634138107299805, 1.6199390888214111, -0.8765130639076233, -0.4082728326320648, 0.4292406439781189, -0.3038734495639801, 0.00020255155686754733, -0.10973295569419861, 0.10103811323642731, -0.7566922903060913, 1.201561450958252, 0.04530053585767746, 1.48433256149292, -1.4958760738372803, 0.29490426182746887, 0.735073447227478, 0.6239333748817444, -1.2725467681884766, 0.8728184700012207, -0.7653454542160034, -0.13305020332336426, 1.9468834400177002, 2.4297072887420654, 1.7113466262817383, -1.1554838418960571, 0.035768039524555206, 0.26373907923698425, -0.03857085481286049, -1.030165672302246, -1.9738726615905762, 0.3481074869632721, -0.4252174496650696, -0.04754994064569473, 0.6649491190910339, -1.1836568117141724, -0.29658934473991394, 0.7145687341690063},
                            {-0.5735183358192444, 0.005896596238017082, 0.07026499509811401, -1.0516016483306885, 0.40990760922431946, -1.519545078277588, -0.12028831243515015, -1.4255272150039673, -0.6732795834541321, -0.5314444303512573, 0.8614209890365601, -0.18908481299877167, 1.2515850067138672, -0.33477455377578735, 1.0043144226074219, 0.26335152983665466, -0.7736467719078064, -0.610704779624939, 0.14823174476623535, 0.7582481503486633, -0.89017254114151, -0.6541666388511658, 1.7902003526687622, 0.12512031197547913, 0.03991509601473808, 1.8844478130340576, 0.12046905606985092, -0.7644900679588318, 0.8469402194023132, 0.18888333439826965, 2.0620357990264893, 1.4848750829696655, 0.49371078610420227, -1.1692612171173096, 0.34266752004623413, -1.111390471458435, -1.9194800853729248, 0.303196519613266, 0.20584909617900848, -1.9672980308532715, 1.3575668334960938, 2.0061933994293213, -0.8416401743888855, -0.019423190504312515, -1.9798663854599, -0.2901528477668762, 0.8275874853134155, 0.6406838893890381, -0.22013679146766663, 0.1373300552368164},
                            {-0.5070935487747192, -0.8618849515914917, 0.7598404288291931, -0.7632965445518494, 0.7372108101844788, -0.7502579689025879, -0.4673466384410858, 0.03350372612476349, -0.1724679172039032, 0.34873172640800476, -0.5511385202407837, -0.8617361783981323, 1.2812525033950806, 1.1977880001068115, 0.422703355550766, -2.4478912353515625, 0.27947863936424255, 0.6899591684341431, 0.023330552503466606, 3.2386202812194824, 1.835152506828308, -1.3643983602523804, 1.940202236175537, -0.5567695498466492, -0.9043402075767517, 0.2982616722583771, 0.7104737758636475, 0.05262554809451103, 0.8592529296875, -0.3310755491256714, 0.11795064806938171, 0.5258741974830627, -0.18802325427532196, -0.26788589358329773, 0.6526803970336914, -1.298613429069519, -1.7447354793548584, 0.7002922892570496, 0.5828584432601929, -1.5788142681121826, 0.30589115619659424, 0.20253418385982513, -1.2974342107772827, -0.036622676998376846, -1.264859914779663, -0.3871012032032013, -0.4832276999950409, 0.10778568685054779, 0.7777668833732605, 0.40499362349510193},
                            {0.9790793061256409, -0.8327827453613281, 0.5742382407188416, -0.241596519947052, -0.20028072595596313, -0.7769615054130554, -1.190406322479248, 0.508434534072876, -2.475158452987671, 0.5680020451545715, -1.662092924118042, -1.3921698331832886, 2.20672345161438, -1.5228992700576782, -0.39632880687713623, -0.27906090021133423, -0.15907344222068787, 0.3922439217567444, -0.787753701210022, 1.533280611038208, 1.4667662382125854, 0.3229754567146301, 0.08585838973522186, -1.5718507766723633, 0.4096935987472534, 0.715343177318573, 0.9958964586257935, 1.2487760782241821, -0.08343572914600372, -1.0164155960083008, 0.3275226056575775, 0.6343787908554077, -0.7280924320220947, 0.6641810536384583, 1.6676288843154907, -1.5158360004425049, 1.9924885034561157, 0.584326446056366, -0.05175713077187538, -0.8921176195144653, -0.05891117826104164, 0.4360177516937256, 0.3757384717464447, -0.19090303778648376, -1.121803641319275, -0.07946958392858505, 0.7248428463935852, 0.06145211309194565, -0.8474668860435486, 0.598736047744751},
                            {0.13182871043682098, -1.8527439832687378, -0.24037398397922516, -0.4527086615562439, -0.5142684578895569, 0.578464150428772, 0.6006605625152588, 0.656891942024231, 0.1326184719800949, 0.03020528331398964, 2.6893508434295654, -2.0991835594177246, -0.8301790356636047, 0.11594317108392715, -0.5993587970733643, 1.4296510219573975, -0.6532222032546997, 1.4397293329238892, 1.2564067840576172, 1.098759412765503, 0.2947686016559601, -0.41795819997787476, 1.5545347929000854, 0.52629554271698, -0.21128879487514496, 0.6580076217651367, -0.5271479487419128, 1.1180450916290283, 0.5557465553283691, 1.3636577129364014, -1.094968318939209, 0.9319839477539062, -0.5854425430297852, 0.2713215947151184, 1.3153860569000244, -0.935158371925354, -0.6154105067253113, -1.1272748708724976, 1.2313356399536133, -1.4124794006347656, -0.03874369338154793, -1.23979914188385, -1.7541760206222534, -0.29308855533599854, -0.5822644233703613, 0.013161801733076572, -0.06327825039625168, -0.11618737131357193, -1.5397554636001587, -0.19829346239566803},
                            {0.0013332264497876167, 0.8481882810592651, -0.768883466720581, -0.10661126673221588, -0.30787110328674316, -0.47086861729621887, 0.15401172637939453, 0.10515493154525757, -1.9277739524841309, -0.8757210373878479, -0.4928605854511261, -2.2564198970794678, -0.548955500125885, -0.17002613842487335, 0.2518070638179779, -0.4958566725254059, 0.24115560948848724, 0.46547016501426697, -0.18646040558815002, 1.8159278631210327, 1.3635350465774536, -0.6588341593742371, -1.2847622632980347, 1.0262277126312256, 0.4574947953224182, 2.02490234375, 0.5681936144828796, 0.5467365384101868, -1.489783525466919, -0.33221685886383057, -0.5433152318000793, 1.5180481672286987, 0.21392902731895447, 0.592125654220581, 0.8234230279922485, -1.286543607711792, 0.3742519021034241, -0.8470395803451538, 2.015620470046997, -0.266152948141098, -0.509074866771698, 2.9326205253601074, -0.3784724473953247, -0.010701287537813187, -0.5838567614555359, 0.7221097946166992, -0.19488774240016937, -0.41090619564056396, -1.174034833908081, -0.4833768904209137},
                            {-1.1144920587539673, -0.35063648223876953, 1.8217822313308716, -0.48949581384658813, -1.2925562858581543, -0.5098785161972046, -0.5128171443939209, 0.1419551968574524, -2.438873767852783, -0.7029894590377808, -0.42537757754325867, 1.2728787660598755, -0.9750368595123291, -0.18741849064826965, -1.15322744846344, -0.4969038665294647, 0.2774584889411926, 0.23619344830513, 0.6430550217628479, 2.301358938217163, -0.10586179792881012, -0.2300921380519867, -0.5464906096458435, 0.46304431557655334, 0.40598222613334656, 0.3899063467979431, -0.020308958366513252, 1.85163414478302, -0.8247016072273254, -0.18942953646183014, -0.8463541865348816, 0.9607068300247192, -0.2659664750099182, 0.9000354409217834, 1.2827112674713135, -0.007229707669466734, 1.2139497995376587, 0.7489311695098877, 0.4424838423728943, -1.2714074850082397, 0.4331207871437073, 1.0890902280807495, -0.4623361825942993, 2.1549410820007324, -1.7559632062911987, -0.791874349117279, -0.15250569581985474, -1.5794051885604858, -0.15555831789970398, 0.8239690065383911},
                            {-0.5861448049545288, -0.6640603542327881, -1.0603013038635254, -1.3815442323684692, -2.1465418338775635, 0.47405195236206055, -0.7235577702522278, 1.4718230962753296, -1.3939424753189087, 0.04069202393293381, 1.031272530555725, -0.1701117753982544, 0.3608003556728363, -0.6034207940101624, -0.7339737415313721, -0.4035419523715973, 0.25463899970054626, -0.7091950178146362, 1.2676637172698975, 0.6636833548545837, 0.9009960293769836, 0.9830664396286011, 0.5832557082176208, -0.7218805551528931, 0.9672513008117676, -1.8420109748840332, 1.5450838804244995, -0.05154690146446228, -1.3365509510040283, 0.3695466220378876, 0.24466310441493988, 1.4004534482955933, -1.043494701385498, 0.4102145731449127, 1.4667704105377197, 0.701165497303009, 1.6584479808807373, -0.8489638566970825, 1.3032140731811523, -0.9052810072898865, -1.1861495971679688, 1.2016456127166748, -0.8434803485870361, 0.4377703070640564, -0.4729674160480499, -1.5361210107803345, 1.1898629665374756, 0.727762758731842, 0.2389160394668579, -0.5299307107925415}};

            double[] average = new double[expectedTokens[0].length];
            // Strip off [CLS] and [SEP]
            for (int i = 1; i < expectedTokens.length-1; i++) {
                for (int j = 0; j < average.length; j++) {
                    average[j] += expectedTokens[i][j];
                }
            }
            for (int i = 0; i < average.length; i++) {
                average[i] /= expectedTokens.length-2;
            }

            Assertions.assertArrayEquals(average, aveEmbeddingArr, 1e-6);
        }
    }

}
