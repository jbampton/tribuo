// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-math-impl.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.math.protos;

public interface DenseTensorProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.math.impl.DenseTensorProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int32 dimensions = 1;</code>
   * @return A list containing the dimensions.
   */
  java.util.List<java.lang.Integer> getDimensionsList();
  /**
   * <code>repeated int32 dimensions = 1;</code>
   * @return The count of dimensions.
   */
  int getDimensionsCount();
  /**
   * <code>repeated int32 dimensions = 1;</code>
   * @param index The index of the element to return.
   * @return The dimensions at the given index.
   */
  int getDimensions(int index);

  /**
   * <code>bytes values = 2;</code>
   * @return The values.
   */
  com.google.protobuf.ByteString getValues();
}
