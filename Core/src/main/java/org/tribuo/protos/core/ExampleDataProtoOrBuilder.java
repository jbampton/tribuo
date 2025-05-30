// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-impl.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.protos.core;

public interface ExampleDataProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.core.ExampleDataProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tribuo.core.OutputProto output = 1;</code>
   * @return Whether the output field is set.
   */
  boolean hasOutput();
  /**
   * <code>.tribuo.core.OutputProto output = 1;</code>
   * @return The output.
   */
  org.tribuo.protos.core.OutputProto getOutput();
  /**
   * <code>.tribuo.core.OutputProto output = 1;</code>
   */
  org.tribuo.protos.core.OutputProtoOrBuilder getOutputOrBuilder();

  /**
   * <code>repeated string feature_name = 2;</code>
   * @return A list containing the featureName.
   */
  java.util.List<java.lang.String>
      getFeatureNameList();
  /**
   * <code>repeated string feature_name = 2;</code>
   * @return The count of featureName.
   */
  int getFeatureNameCount();
  /**
   * <code>repeated string feature_name = 2;</code>
   * @param index The index of the element to return.
   * @return The featureName at the given index.
   */
  java.lang.String getFeatureName(int index);
  /**
   * <code>repeated string feature_name = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the featureName at the given index.
   */
  com.google.protobuf.ByteString
      getFeatureNameBytes(int index);

  /**
   * <code>repeated double feature_value = 3;</code>
   * @return A list containing the featureValue.
   */
  java.util.List<java.lang.Double> getFeatureValueList();
  /**
   * <code>repeated double feature_value = 3;</code>
   * @return The count of featureValue.
   */
  int getFeatureValueCount();
  /**
   * <code>repeated double feature_value = 3;</code>
   * @param index The index of the element to return.
   * @return The featureValue at the given index.
   */
  double getFeatureValue(int index);

  /**
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  int getMetadataCount();
  /**
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);

  /**
   * <code>float weight = 5;</code>
   * @return The weight.
   */
  float getWeight();
}
