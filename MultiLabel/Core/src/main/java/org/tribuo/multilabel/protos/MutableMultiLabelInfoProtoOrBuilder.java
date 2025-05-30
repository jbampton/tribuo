// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-multilabel-core.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.multilabel.protos;

public interface MutableMultiLabelInfoProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.multilabel.MutableMultiLabelInfoProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string label = 1;</code>
   * @return A list containing the label.
   */
  java.util.List<java.lang.String>
      getLabelList();
  /**
   * <code>repeated string label = 1;</code>
   * @return The count of label.
   */
  int getLabelCount();
  /**
   * <code>repeated string label = 1;</code>
   * @param index The index of the element to return.
   * @return The label at the given index.
   */
  java.lang.String getLabel(int index);
  /**
   * <code>repeated string label = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the label at the given index.
   */
  com.google.protobuf.ByteString
      getLabelBytes(int index);

  /**
   * <code>repeated int64 count = 2;</code>
   * @return A list containing the count.
   */
  java.util.List<java.lang.Long> getCountList();
  /**
   * <code>repeated int64 count = 2;</code>
   * @return The count of count.
   */
  int getCountCount();
  /**
   * <code>repeated int64 count = 2;</code>
   * @param index The index of the element to return.
   * @return The count at the given index.
   */
  long getCount(int index);

  /**
   * <code>int32 unknownCount = 3;</code>
   * @return The unknownCount.
   */
  int getUnknownCount();

  /**
   * <code>int32 totalCount = 4;</code>
   * @return The totalCount.
   */
  int getTotalCount();
}
