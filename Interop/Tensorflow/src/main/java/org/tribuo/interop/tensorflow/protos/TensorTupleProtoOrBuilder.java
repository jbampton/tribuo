// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-tensorflow.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.interop.tensorflow.protos;

public interface TensorTupleProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.interop.tensorflow.TensorTupleProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string class_name = 1;</code>
   * @return The className.
   */
  java.lang.String getClassName();
  /**
   * <code>string class_name = 1;</code>
   * @return The bytes for className.
   */
  com.google.protobuf.ByteString
      getClassNameBytes();

  /**
   * <code>repeated int64 shape = 2;</code>
   * @return A list containing the shape.
   */
  java.util.List<java.lang.Long> getShapeList();
  /**
   * <code>repeated int64 shape = 2;</code>
   * @return The count of shape.
   */
  int getShapeCount();
  /**
   * <code>repeated int64 shape = 2;</code>
   * @param index The index of the element to return.
   * @return The shape at the given index.
   */
  long getShape(int index);

  /**
   * <code>bytes data = 3;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
