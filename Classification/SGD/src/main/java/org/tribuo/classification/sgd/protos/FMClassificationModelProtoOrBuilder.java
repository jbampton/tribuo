// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-classification-sgd.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.classification.sgd.protos;

public interface FMClassificationModelProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.classification.sgd.FMClassificationModelProto)
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
   * <code>.tribuo.math.ParametersProto params = 2;</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.tribuo.math.ParametersProto params = 2;</code>
   * @return The params.
   */
  org.tribuo.math.protos.ParametersProto getParams();
  /**
   * <code>.tribuo.math.ParametersProto params = 2;</code>
   */
  org.tribuo.math.protos.ParametersProtoOrBuilder getParamsOrBuilder();

  /**
   * <code>.tribuo.math.NormalizerProto normalizer = 3;</code>
   * @return Whether the normalizer field is set.
   */
  boolean hasNormalizer();
  /**
   * <code>.tribuo.math.NormalizerProto normalizer = 3;</code>
   * @return The normalizer.
   */
  org.tribuo.math.protos.NormalizerProto getNormalizer();
  /**
   * <code>.tribuo.math.NormalizerProto normalizer = 3;</code>
   */
  org.tribuo.math.protos.NormalizerProtoOrBuilder getNormalizerOrBuilder();
}
