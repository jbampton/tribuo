// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-clustering-core.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.clustering.protos;

public interface ClusteringInfoProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.clustering.ClusteringInfoProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int32 id = 1;</code>
   * @return A list containing the id.
   */
  java.util.List<java.lang.Integer> getIdList();
  /**
   * <code>repeated int32 id = 1;</code>
   * @return The count of id.
   */
  int getIdCount();
  /**
   * <code>repeated int32 id = 1;</code>
   * @param index The index of the element to return.
   * @return The id at the given index.
   */
  int getId(int index);

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
}
