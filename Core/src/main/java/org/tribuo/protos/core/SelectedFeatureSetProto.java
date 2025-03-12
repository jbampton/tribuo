// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-impl.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.protos.core;

/**
 * <pre>
 *
 *SelectedFeatureSet proto
 * </pre>
 *
 * Protobuf type {@code tribuo.core.SelectedFeatureSetProto}
 */
public final class SelectedFeatureSetProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tribuo.core.SelectedFeatureSetProto)
    SelectedFeatureSetProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SelectedFeatureSetProto.newBuilder() to construct.
  private SelectedFeatureSetProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SelectedFeatureSetProto() {
    featureNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    featureScores_ = emptyDoubleList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SelectedFeatureSetProto();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_SelectedFeatureSetProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_SelectedFeatureSetProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tribuo.protos.core.SelectedFeatureSetProto.class, org.tribuo.protos.core.SelectedFeatureSetProto.Builder.class);
  }

  private int bitField0_;
  public static final int FEATURE_NAMES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList featureNames_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string feature_names = 1;</code>
   * @return A list containing the featureNames.
   */
  public com.google.protobuf.ProtocolStringList
      getFeatureNamesList() {
    return featureNames_;
  }
  /**
   * <code>repeated string feature_names = 1;</code>
   * @return The count of featureNames.
   */
  public int getFeatureNamesCount() {
    return featureNames_.size();
  }
  /**
   * <code>repeated string feature_names = 1;</code>
   * @param index The index of the element to return.
   * @return The featureNames at the given index.
   */
  public java.lang.String getFeatureNames(int index) {
    return featureNames_.get(index);
  }
  /**
   * <code>repeated string feature_names = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the featureNames at the given index.
   */
  public com.google.protobuf.ByteString
      getFeatureNamesBytes(int index) {
    return featureNames_.getByteString(index);
  }

  public static final int FEATURE_SCORES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.DoubleList featureScores_ =
      emptyDoubleList();
  /**
   * <code>repeated double feature_scores = 2;</code>
   * @return A list containing the featureScores.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double>
      getFeatureScoresList() {
    return featureScores_;
  }
  /**
   * <code>repeated double feature_scores = 2;</code>
   * @return The count of featureScores.
   */
  public int getFeatureScoresCount() {
    return featureScores_.size();
  }
  /**
   * <code>repeated double feature_scores = 2;</code>
   * @param index The index of the element to return.
   * @return The featureScores at the given index.
   */
  public double getFeatureScores(int index) {
    return featureScores_.getDouble(index);
  }
  private int featureScoresMemoizedSerializedSize = -1;

  public static final int PROVENANCE_FIELD_NUMBER = 3;
  private com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto provenance_;
  /**
   * <code>.olcut.RootProvenanceProto provenance = 3;</code>
   * @return Whether the provenance field is set.
   */
  @java.lang.Override
  public boolean hasProvenance() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.olcut.RootProvenanceProto provenance = 3;</code>
   * @return The provenance.
   */
  @java.lang.Override
  public com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto getProvenance() {
    return provenance_ == null ? com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto.getDefaultInstance() : provenance_;
  }
  /**
   * <code>.olcut.RootProvenanceProto provenance = 3;</code>
   */
  @java.lang.Override
  public com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProtoOrBuilder getProvenanceOrBuilder() {
    return provenance_ == null ? com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto.getDefaultInstance() : provenance_;
  }

  public static final int ORDERED_FIELD_NUMBER = 4;
  private boolean ordered_ = false;
  /**
   * <code>bool ordered = 4;</code>
   * @return The ordered.
   */
  @java.lang.Override
  public boolean getOrdered() {
    return ordered_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    for (int i = 0; i < featureNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, featureNames_.getRaw(i));
    }
    if (getFeatureScoresList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(featureScoresMemoizedSerializedSize);
    }
    for (int i = 0; i < featureScores_.size(); i++) {
      output.writeDoubleNoTag(featureScores_.getDouble(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getProvenance());
    }
    if (ordered_ != false) {
      output.writeBool(4, ordered_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < featureNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(featureNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFeatureNamesList().size();
    }
    {
      int dataSize = 0;
      dataSize = 8 * getFeatureScoresList().size();
      size += dataSize;
      if (!getFeatureScoresList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      featureScoresMemoizedSerializedSize = dataSize;
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProvenance());
    }
    if (ordered_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, ordered_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tribuo.protos.core.SelectedFeatureSetProto)) {
      return super.equals(obj);
    }
    org.tribuo.protos.core.SelectedFeatureSetProto other = (org.tribuo.protos.core.SelectedFeatureSetProto) obj;

    if (!getFeatureNamesList()
        .equals(other.getFeatureNamesList())) return false;
    if (!getFeatureScoresList()
        .equals(other.getFeatureScoresList())) return false;
    if (hasProvenance() != other.hasProvenance()) return false;
    if (hasProvenance()) {
      if (!getProvenance()
          .equals(other.getProvenance())) return false;
    }
    if (getOrdered()
        != other.getOrdered()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getFeatureNamesCount() > 0) {
      hash = (37 * hash) + FEATURE_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getFeatureNamesList().hashCode();
    }
    if (getFeatureScoresCount() > 0) {
      hash = (37 * hash) + FEATURE_SCORES_FIELD_NUMBER;
      hash = (53 * hash) + getFeatureScoresList().hashCode();
    }
    if (hasProvenance()) {
      hash = (37 * hash) + PROVENANCE_FIELD_NUMBER;
      hash = (53 * hash) + getProvenance().hashCode();
    }
    hash = (37 * hash) + ORDERED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOrdered());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tribuo.protos.core.SelectedFeatureSetProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.protos.core.SelectedFeatureSetProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.protos.core.SelectedFeatureSetProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.protos.core.SelectedFeatureSetProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.protos.core.SelectedFeatureSetProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.protos.core.SelectedFeatureSetProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.protos.core.SelectedFeatureSetProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.protos.core.SelectedFeatureSetProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.tribuo.protos.core.SelectedFeatureSetProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.tribuo.protos.core.SelectedFeatureSetProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.protos.core.SelectedFeatureSetProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.protos.core.SelectedFeatureSetProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tribuo.protos.core.SelectedFeatureSetProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *
   *SelectedFeatureSet proto
   * </pre>
   *
   * Protobuf type {@code tribuo.core.SelectedFeatureSetProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tribuo.core.SelectedFeatureSetProto)
      org.tribuo.protos.core.SelectedFeatureSetProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_SelectedFeatureSetProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_SelectedFeatureSetProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tribuo.protos.core.SelectedFeatureSetProto.class, org.tribuo.protos.core.SelectedFeatureSetProto.Builder.class);
    }

    // Construct using org.tribuo.protos.core.SelectedFeatureSetProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getProvenanceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      featureNames_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      featureScores_ = emptyDoubleList();
      provenance_ = null;
      if (provenanceBuilder_ != null) {
        provenanceBuilder_.dispose();
        provenanceBuilder_ = null;
      }
      ordered_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tribuo.protos.core.TribuoCoreImpl.internal_static_tribuo_core_SelectedFeatureSetProto_descriptor;
    }

    @java.lang.Override
    public org.tribuo.protos.core.SelectedFeatureSetProto getDefaultInstanceForType() {
      return org.tribuo.protos.core.SelectedFeatureSetProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tribuo.protos.core.SelectedFeatureSetProto build() {
      org.tribuo.protos.core.SelectedFeatureSetProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tribuo.protos.core.SelectedFeatureSetProto buildPartial() {
      org.tribuo.protos.core.SelectedFeatureSetProto result = new org.tribuo.protos.core.SelectedFeatureSetProto(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.tribuo.protos.core.SelectedFeatureSetProto result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        featureNames_.makeImmutable();
        result.featureNames_ = featureNames_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        featureScores_.makeImmutable();
        result.featureScores_ = featureScores_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.provenance_ = provenanceBuilder_ == null
            ? provenance_
            : provenanceBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.ordered_ = ordered_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tribuo.protos.core.SelectedFeatureSetProto) {
        return mergeFrom((org.tribuo.protos.core.SelectedFeatureSetProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tribuo.protos.core.SelectedFeatureSetProto other) {
      if (other == org.tribuo.protos.core.SelectedFeatureSetProto.getDefaultInstance()) return this;
      if (!other.featureNames_.isEmpty()) {
        if (featureNames_.isEmpty()) {
          featureNames_ = other.featureNames_;
          bitField0_ |= 0x00000001;
        } else {
          ensureFeatureNamesIsMutable();
          featureNames_.addAll(other.featureNames_);
        }
        onChanged();
      }
      if (!other.featureScores_.isEmpty()) {
        if (featureScores_.isEmpty()) {
          featureScores_ = other.featureScores_;
          featureScores_.makeImmutable();
          bitField0_ |= 0x00000002;
        } else {
          ensureFeatureScoresIsMutable();
          featureScores_.addAll(other.featureScores_);
        }
        onChanged();
      }
      if (other.hasProvenance()) {
        mergeProvenance(other.getProvenance());
      }
      if (other.getOrdered() != false) {
        setOrdered(other.getOrdered());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureFeatureNamesIsMutable();
              featureNames_.add(s);
              break;
            } // case 10
            case 17: {
              double v = input.readDouble();
              ensureFeatureScoresIsMutable();
              featureScores_.addDouble(v);
              break;
            } // case 17
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              int alloc = length > 4096 ? 4096 : length;
              ensureFeatureScoresIsMutable(alloc / 8);
              while (input.getBytesUntilLimit() > 0) {
                featureScores_.addDouble(input.readDouble());
              }
              input.popLimit(limit);
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getProvenanceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              ordered_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringArrayList featureNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureFeatureNamesIsMutable() {
      if (!featureNames_.isModifiable()) {
        featureNames_ = new com.google.protobuf.LazyStringArrayList(featureNames_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string feature_names = 1;</code>
     * @return A list containing the featureNames.
     */
    public com.google.protobuf.ProtocolStringList
        getFeatureNamesList() {
      featureNames_.makeImmutable();
      return featureNames_;
    }
    /**
     * <code>repeated string feature_names = 1;</code>
     * @return The count of featureNames.
     */
    public int getFeatureNamesCount() {
      return featureNames_.size();
    }
    /**
     * <code>repeated string feature_names = 1;</code>
     * @param index The index of the element to return.
     * @return The featureNames at the given index.
     */
    public java.lang.String getFeatureNames(int index) {
      return featureNames_.get(index);
    }
    /**
     * <code>repeated string feature_names = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the featureNames at the given index.
     */
    public com.google.protobuf.ByteString
        getFeatureNamesBytes(int index) {
      return featureNames_.getByteString(index);
    }
    /**
     * <code>repeated string feature_names = 1;</code>
     * @param index The index to set the value at.
     * @param value The featureNames to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureNames(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFeatureNamesIsMutable();
      featureNames_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string feature_names = 1;</code>
     * @param value The featureNames to add.
     * @return This builder for chaining.
     */
    public Builder addFeatureNames(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFeatureNamesIsMutable();
      featureNames_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string feature_names = 1;</code>
     * @param values The featureNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllFeatureNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureFeatureNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, featureNames_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string feature_names = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeatureNames() {
      featureNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string feature_names = 1;</code>
     * @param value The bytes of the featureNames to add.
     * @return This builder for chaining.
     */
    public Builder addFeatureNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureFeatureNamesIsMutable();
      featureNames_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.DoubleList featureScores_ = emptyDoubleList();
    private void ensureFeatureScoresIsMutable() {
      if (!featureScores_.isModifiable()) {
        featureScores_ = makeMutableCopy(featureScores_);
      }
      bitField0_ |= 0x00000002;
    }
    private void ensureFeatureScoresIsMutable(int capacity) {
      if (!featureScores_.isModifiable()) {
        featureScores_ = makeMutableCopy(featureScores_, capacity);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated double feature_scores = 2;</code>
     * @return A list containing the featureScores.
     */
    public java.util.List<java.lang.Double>
        getFeatureScoresList() {
      featureScores_.makeImmutable();
      return featureScores_;
    }
    /**
     * <code>repeated double feature_scores = 2;</code>
     * @return The count of featureScores.
     */
    public int getFeatureScoresCount() {
      return featureScores_.size();
    }
    /**
     * <code>repeated double feature_scores = 2;</code>
     * @param index The index of the element to return.
     * @return The featureScores at the given index.
     */
    public double getFeatureScores(int index) {
      return featureScores_.getDouble(index);
    }
    /**
     * <code>repeated double feature_scores = 2;</code>
     * @param index The index to set the value at.
     * @param value The featureScores to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureScores(
        int index, double value) {

      ensureFeatureScoresIsMutable();
      featureScores_.setDouble(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated double feature_scores = 2;</code>
     * @param value The featureScores to add.
     * @return This builder for chaining.
     */
    public Builder addFeatureScores(double value) {

      ensureFeatureScoresIsMutable();
      featureScores_.addDouble(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated double feature_scores = 2;</code>
     * @param values The featureScores to add.
     * @return This builder for chaining.
     */
    public Builder addAllFeatureScores(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureFeatureScoresIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, featureScores_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated double feature_scores = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeatureScores() {
      featureScores_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto provenance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto, com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto.Builder, com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProtoOrBuilder> provenanceBuilder_;
    /**
     * <code>.olcut.RootProvenanceProto provenance = 3;</code>
     * @return Whether the provenance field is set.
     */
    public boolean hasProvenance() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.olcut.RootProvenanceProto provenance = 3;</code>
     * @return The provenance.
     */
    public com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto getProvenance() {
      if (provenanceBuilder_ == null) {
        return provenance_ == null ? com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto.getDefaultInstance() : provenance_;
      } else {
        return provenanceBuilder_.getMessage();
      }
    }
    /**
     * <code>.olcut.RootProvenanceProto provenance = 3;</code>
     */
    public Builder setProvenance(com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto value) {
      if (provenanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        provenance_ = value;
      } else {
        provenanceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.olcut.RootProvenanceProto provenance = 3;</code>
     */
    public Builder setProvenance(
        com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto.Builder builderForValue) {
      if (provenanceBuilder_ == null) {
        provenance_ = builderForValue.build();
      } else {
        provenanceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.olcut.RootProvenanceProto provenance = 3;</code>
     */
    public Builder mergeProvenance(com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto value) {
      if (provenanceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          provenance_ != null &&
          provenance_ != com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto.getDefaultInstance()) {
          getProvenanceBuilder().mergeFrom(value);
        } else {
          provenance_ = value;
        }
      } else {
        provenanceBuilder_.mergeFrom(value);
      }
      if (provenance_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.olcut.RootProvenanceProto provenance = 3;</code>
     */
    public Builder clearProvenance() {
      bitField0_ = (bitField0_ & ~0x00000004);
      provenance_ = null;
      if (provenanceBuilder_ != null) {
        provenanceBuilder_.dispose();
        provenanceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.olcut.RootProvenanceProto provenance = 3;</code>
     */
    public com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto.Builder getProvenanceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getProvenanceFieldBuilder().getBuilder();
    }
    /**
     * <code>.olcut.RootProvenanceProto provenance = 3;</code>
     */
    public com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProtoOrBuilder getProvenanceOrBuilder() {
      if (provenanceBuilder_ != null) {
        return provenanceBuilder_.getMessageOrBuilder();
      } else {
        return provenance_ == null ?
            com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto.getDefaultInstance() : provenance_;
      }
    }
    /**
     * <code>.olcut.RootProvenanceProto provenance = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto, com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto.Builder, com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProtoOrBuilder> 
        getProvenanceFieldBuilder() {
      if (provenanceBuilder_ == null) {
        provenanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto, com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto.Builder, com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProtoOrBuilder>(
                getProvenance(),
                getParentForChildren(),
                isClean());
        provenance_ = null;
      }
      return provenanceBuilder_;
    }

    private boolean ordered_ ;
    /**
     * <code>bool ordered = 4;</code>
     * @return The ordered.
     */
    @java.lang.Override
    public boolean getOrdered() {
      return ordered_;
    }
    /**
     * <code>bool ordered = 4;</code>
     * @param value The ordered to set.
     * @return This builder for chaining.
     */
    public Builder setOrdered(boolean value) {

      ordered_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool ordered = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrdered() {
      bitField0_ = (bitField0_ & ~0x00000008);
      ordered_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tribuo.core.SelectedFeatureSetProto)
  }

  // @@protoc_insertion_point(class_scope:tribuo.core.SelectedFeatureSetProto)
  private static final org.tribuo.protos.core.SelectedFeatureSetProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tribuo.protos.core.SelectedFeatureSetProto();
  }

  public static org.tribuo.protos.core.SelectedFeatureSetProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SelectedFeatureSetProto>
      PARSER = new com.google.protobuf.AbstractParser<SelectedFeatureSetProto>() {
    @java.lang.Override
    public SelectedFeatureSetProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SelectedFeatureSetProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SelectedFeatureSetProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tribuo.protos.core.SelectedFeatureSetProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

