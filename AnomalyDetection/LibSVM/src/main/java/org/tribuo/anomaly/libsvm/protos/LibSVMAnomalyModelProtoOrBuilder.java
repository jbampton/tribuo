// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-anomaly-libsvm.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.anomaly.libsvm.protos;

public interface LibSVMAnomalyModelProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.anomaly.libsvm.LibSVMAnomalyModelProto)
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
   * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
   * @return The model.
   */
  org.tribuo.common.libsvm.protos.SVMModelProto getModel();
  /**
   * <code>.tribuo.common.libsvm.SVMModelProto model = 2;</code>
   */
  org.tribuo.common.libsvm.protos.SVMModelProtoOrBuilder getModelOrBuilder();
}
