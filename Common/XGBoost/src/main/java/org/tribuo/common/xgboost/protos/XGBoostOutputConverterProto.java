// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-xgboost.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.common.xgboost.protos;

/**
 * <pre>
 *
 *XGBoostOutputConverter redirect proto
 * </pre>
 *
 * Protobuf type {@code tribuo.common.xgboost.XGBoostOutputConverterProto}
 */
public final class XGBoostOutputConverterProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tribuo.common.xgboost.XGBoostOutputConverterProto)
    XGBoostOutputConverterProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use XGBoostOutputConverterProto.newBuilder() to construct.
  private XGBoostOutputConverterProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private XGBoostOutputConverterProto() {
    className_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new XGBoostOutputConverterProto();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tribuo.common.xgboost.protos.TribuoXgboost.internal_static_tribuo_common_xgboost_XGBoostOutputConverterProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tribuo.common.xgboost.protos.TribuoXgboost.internal_static_tribuo_common_xgboost_XGBoostOutputConverterProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto.class, org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto.Builder.class);
  }

  private int bitField0_;
  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_ = 0;
  /**
   * <code>int32 version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public int getVersion() {
    return version_;
  }

  public static final int CLASS_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object className_ = "";
  /**
   * <code>string class_name = 2;</code>
   * @return The className.
   */
  @java.lang.Override
  public java.lang.String getClassName() {
    java.lang.Object ref = className_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      className_ = s;
      return s;
    }
  }
  /**
   * <code>string class_name = 2;</code>
   * @return The bytes for className.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClassNameBytes() {
    java.lang.Object ref = className_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      className_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERIALIZED_DATA_FIELD_NUMBER = 3;
  private com.google.protobuf.Any serializedData_;
  /**
   * <code>.google.protobuf.Any serialized_data = 3;</code>
   * @return Whether the serializedData field is set.
   */
  @java.lang.Override
  public boolean hasSerializedData() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Any serialized_data = 3;</code>
   * @return The serializedData.
   */
  @java.lang.Override
  public com.google.protobuf.Any getSerializedData() {
    return serializedData_ == null ? com.google.protobuf.Any.getDefaultInstance() : serializedData_;
  }
  /**
   * <code>.google.protobuf.Any serialized_data = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getSerializedDataOrBuilder() {
    return serializedData_ == null ? com.google.protobuf.Any.getDefaultInstance() : serializedData_;
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
    if (version_ != 0) {
      output.writeInt32(1, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(className_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, className_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getSerializedData());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(className_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, className_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSerializedData());
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
    if (!(obj instanceof org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto)) {
      return super.equals(obj);
    }
    org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto other = (org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto) obj;

    if (getVersion()
        != other.getVersion()) return false;
    if (!getClassName()
        .equals(other.getClassName())) return false;
    if (hasSerializedData() != other.hasSerializedData()) return false;
    if (hasSerializedData()) {
      if (!getSerializedData()
          .equals(other.getSerializedData())) return false;
    }
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (37 * hash) + CLASS_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getClassName().hashCode();
    if (hasSerializedData()) {
      hash = (37 * hash) + SERIALIZED_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getSerializedData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto parseFrom(
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
  public static Builder newBuilder(org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto prototype) {
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
   *XGBoostOutputConverter redirect proto
   * </pre>
   *
   * Protobuf type {@code tribuo.common.xgboost.XGBoostOutputConverterProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tribuo.common.xgboost.XGBoostOutputConverterProto)
      org.tribuo.common.xgboost.protos.XGBoostOutputConverterProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tribuo.common.xgboost.protos.TribuoXgboost.internal_static_tribuo_common_xgboost_XGBoostOutputConverterProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tribuo.common.xgboost.protos.TribuoXgboost.internal_static_tribuo_common_xgboost_XGBoostOutputConverterProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto.class, org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto.Builder.class);
    }

    // Construct using org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto.newBuilder()
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
        getSerializedDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      version_ = 0;
      className_ = "";
      serializedData_ = null;
      if (serializedDataBuilder_ != null) {
        serializedDataBuilder_.dispose();
        serializedDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tribuo.common.xgboost.protos.TribuoXgboost.internal_static_tribuo_common_xgboost_XGBoostOutputConverterProto_descriptor;
    }

    @java.lang.Override
    public org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto getDefaultInstanceForType() {
      return org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto build() {
      org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto buildPartial() {
      org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto result = new org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.className_ = className_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.serializedData_ = serializedDataBuilder_ == null
            ? serializedData_
            : serializedDataBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto) {
        return mergeFrom((org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto other) {
      if (other == org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto.getDefaultInstance()) return this;
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (!other.getClassName().isEmpty()) {
        className_ = other.className_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSerializedData()) {
        mergeSerializedData(other.getSerializedData());
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
            case 8: {
              version_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              className_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getSerializedDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int version_ ;
    /**
     * <code>int32 version = 1;</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }
    /**
     * <code>int32 version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(int value) {

      version_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      version_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object className_ = "";
    /**
     * <code>string class_name = 2;</code>
     * @return The className.
     */
    public java.lang.String getClassName() {
      java.lang.Object ref = className_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        className_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string class_name = 2;</code>
     * @return The bytes for className.
     */
    public com.google.protobuf.ByteString
        getClassNameBytes() {
      java.lang.Object ref = className_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        className_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string class_name = 2;</code>
     * @param value The className to set.
     * @return This builder for chaining.
     */
    public Builder setClassName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      className_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string class_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearClassName() {
      className_ = getDefaultInstance().getClassName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string class_name = 2;</code>
     * @param value The bytes for className to set.
     * @return This builder for chaining.
     */
    public Builder setClassNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      className_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any serializedData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> serializedDataBuilder_;
    /**
     * <code>.google.protobuf.Any serialized_data = 3;</code>
     * @return Whether the serializedData field is set.
     */
    public boolean hasSerializedData() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Any serialized_data = 3;</code>
     * @return The serializedData.
     */
    public com.google.protobuf.Any getSerializedData() {
      if (serializedDataBuilder_ == null) {
        return serializedData_ == null ? com.google.protobuf.Any.getDefaultInstance() : serializedData_;
      } else {
        return serializedDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any serialized_data = 3;</code>
     */
    public Builder setSerializedData(com.google.protobuf.Any value) {
      if (serializedDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serializedData_ = value;
      } else {
        serializedDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any serialized_data = 3;</code>
     */
    public Builder setSerializedData(
        com.google.protobuf.Any.Builder builderForValue) {
      if (serializedDataBuilder_ == null) {
        serializedData_ = builderForValue.build();
      } else {
        serializedDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any serialized_data = 3;</code>
     */
    public Builder mergeSerializedData(com.google.protobuf.Any value) {
      if (serializedDataBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          serializedData_ != null &&
          serializedData_ != com.google.protobuf.Any.getDefaultInstance()) {
          getSerializedDataBuilder().mergeFrom(value);
        } else {
          serializedData_ = value;
        }
      } else {
        serializedDataBuilder_.mergeFrom(value);
      }
      if (serializedData_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Any serialized_data = 3;</code>
     */
    public Builder clearSerializedData() {
      bitField0_ = (bitField0_ & ~0x00000004);
      serializedData_ = null;
      if (serializedDataBuilder_ != null) {
        serializedDataBuilder_.dispose();
        serializedDataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any serialized_data = 3;</code>
     */
    public com.google.protobuf.Any.Builder getSerializedDataBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSerializedDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any serialized_data = 3;</code>
     */
    public com.google.protobuf.AnyOrBuilder getSerializedDataOrBuilder() {
      if (serializedDataBuilder_ != null) {
        return serializedDataBuilder_.getMessageOrBuilder();
      } else {
        return serializedData_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : serializedData_;
      }
    }
    /**
     * <code>.google.protobuf.Any serialized_data = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getSerializedDataFieldBuilder() {
      if (serializedDataBuilder_ == null) {
        serializedDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getSerializedData(),
                getParentForChildren(),
                isClean());
        serializedData_ = null;
      }
      return serializedDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tribuo.common.xgboost.XGBoostOutputConverterProto)
  }

  // @@protoc_insertion_point(class_scope:tribuo.common.xgboost.XGBoostOutputConverterProto)
  private static final org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto();
  }

  public static org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<XGBoostOutputConverterProto>
      PARSER = new com.google.protobuf.AbstractParser<XGBoostOutputConverterProto>() {
    @java.lang.Override
    public XGBoostOutputConverterProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<XGBoostOutputConverterProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<XGBoostOutputConverterProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tribuo.common.xgboost.protos.XGBoostOutputConverterProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

