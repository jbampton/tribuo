// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-tensorflow.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.interop.tensorflow.protos;

public interface TensorFlowSavedModelExternalModelProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.interop.tensorflow.TensorFlowSavedModelExternalModelProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   * @return The metadata.
   */
  org.tribuo.protos.core.ModelDataProto getMetadata();
  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   */
  org.tribuo.protos.core.ModelDataProtoOrBuilder getMetadataOrBuilder();

  /**
   * <code>repeated int32 forward_feature_mapping = 2;</code>
   * @return A list containing the forwardFeatureMapping.
   */
  java.util.List<java.lang.Integer> getForwardFeatureMappingList();
  /**
   * <code>repeated int32 forward_feature_mapping = 2;</code>
   * @return The count of forwardFeatureMapping.
   */
  int getForwardFeatureMappingCount();
  /**
   * <code>repeated int32 forward_feature_mapping = 2;</code>
   * @param index The index of the element to return.
   * @return The forwardFeatureMapping at the given index.
   */
  int getForwardFeatureMapping(int index);

  /**
   * <code>repeated int32 backward_feature_mapping = 3;</code>
   * @return A list containing the backwardFeatureMapping.
   */
  java.util.List<java.lang.Integer> getBackwardFeatureMappingList();
  /**
   * <code>repeated int32 backward_feature_mapping = 3;</code>
   * @return The count of backwardFeatureMapping.
   */
  int getBackwardFeatureMappingCount();
  /**
   * <code>repeated int32 backward_feature_mapping = 3;</code>
   * @param index The index of the element to return.
   * @return The backwardFeatureMapping at the given index.
   */
  int getBackwardFeatureMapping(int index);

  /**
   * <code>string model_directory = 4;</code>
   * @return The modelDirectory.
   */
  java.lang.String getModelDirectory();
  /**
   * <code>string model_directory = 4;</code>
   * @return The bytes for modelDirectory.
   */
  com.google.protobuf.ByteString
      getModelDirectoryBytes();

  /**
   * <code>.tribuo.interop.tensorflow.FeatureConverterProto feature_converter = 5;</code>
   * @return Whether the featureConverter field is set.
   */
  boolean hasFeatureConverter();
  /**
   * <code>.tribuo.interop.tensorflow.FeatureConverterProto feature_converter = 5;</code>
   * @return The featureConverter.
   */
  org.tribuo.interop.tensorflow.protos.FeatureConverterProto getFeatureConverter();
  /**
   * <code>.tribuo.interop.tensorflow.FeatureConverterProto feature_converter = 5;</code>
   */
  org.tribuo.interop.tensorflow.protos.FeatureConverterProtoOrBuilder getFeatureConverterOrBuilder();

  /**
   * <code>.tribuo.interop.tensorflow.OutputConverterProto output_converter = 6;</code>
   * @return Whether the outputConverter field is set.
   */
  boolean hasOutputConverter();
  /**
   * <code>.tribuo.interop.tensorflow.OutputConverterProto output_converter = 6;</code>
   * @return The outputConverter.
   */
  org.tribuo.interop.tensorflow.protos.OutputConverterProto getOutputConverter();
  /**
   * <code>.tribuo.interop.tensorflow.OutputConverterProto output_converter = 6;</code>
   */
  org.tribuo.interop.tensorflow.protos.OutputConverterProtoOrBuilder getOutputConverterOrBuilder();

  /**
   * <code>string output_name = 7;</code>
   * @return The outputName.
   */
  java.lang.String getOutputName();
  /**
   * <code>string output_name = 7;</code>
   * @return The bytes for outputName.
   */
  com.google.protobuf.ByteString
      getOutputNameBytes();
}
