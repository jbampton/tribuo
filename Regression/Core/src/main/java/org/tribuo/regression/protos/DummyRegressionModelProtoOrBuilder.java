// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-regression-core.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.regression.protos;

public interface DummyRegressionModelProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.regression.DummyRegressionModelProto)
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
   * <code>string dummy_type = 2;</code>
   * @return The dummyType.
   */
  java.lang.String getDummyType();
  /**
   * <code>string dummy_type = 2;</code>
   * @return The bytes for dummyType.
   */
  com.google.protobuf.ByteString
      getDummyTypeBytes();

  /**
   * <code>.tribuo.core.OutputProto output = 3;</code>
   * @return Whether the output field is set.
   */
  boolean hasOutput();
  /**
   * <code>.tribuo.core.OutputProto output = 3;</code>
   * @return The output.
   */
  org.tribuo.protos.core.OutputProto getOutput();
  /**
   * <code>.tribuo.core.OutputProto output = 3;</code>
   */
  org.tribuo.protos.core.OutputProtoOrBuilder getOutputOrBuilder();

  /**
   * <code>int64 seed = 4;</code>
   * @return The seed.
   */
  long getSeed();

  /**
   * <code>repeated double means = 5;</code>
   * @return A list containing the means.
   */
  java.util.List<java.lang.Double> getMeansList();
  /**
   * <code>repeated double means = 5;</code>
   * @return The count of means.
   */
  int getMeansCount();
  /**
   * <code>repeated double means = 5;</code>
   * @param index The index of the element to return.
   * @return The means at the given index.
   */
  double getMeans(int index);

  /**
   * <code>repeated double variances = 6;</code>
   * @return A list containing the variances.
   */
  java.util.List<java.lang.Double> getVariancesList();
  /**
   * <code>repeated double variances = 6;</code>
   * @return The count of variances.
   */
  int getVariancesCount();
  /**
   * <code>repeated double variances = 6;</code>
   * @param index The index of the element to return.
   * @return The variances at the given index.
   */
  double getVariances(int index);

  /**
   * <code>repeated string dimension_names = 7;</code>
   * @return A list containing the dimensionNames.
   */
  java.util.List<java.lang.String>
      getDimensionNamesList();
  /**
   * <code>repeated string dimension_names = 7;</code>
   * @return The count of dimensionNames.
   */
  int getDimensionNamesCount();
  /**
   * <code>repeated string dimension_names = 7;</code>
   * @param index The index of the element to return.
   * @return The dimensionNames at the given index.
   */
  java.lang.String getDimensionNames(int index);
  /**
   * <code>repeated string dimension_names = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dimensionNames at the given index.
   */
  com.google.protobuf.ByteString
      getDimensionNamesBytes(int index);
}
