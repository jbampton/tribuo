// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-regression-libsvm.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.regression.libsvm.protos;

public final class TribuoRegressionLibsvm {
  private TribuoRegressionLibsvm() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_regression_libsvm_LibSVMRegressionModelProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_regression_libsvm_LibSVMRegressionModelProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036tribuo-regression-libsvm.proto\022\030tribuo" +
      ".regression.libsvm\032\021tribuo-core.proto\032\023t" +
      "ribuo-libsvm.proto\"\267\001\n\032LibSVMRegressionM" +
      "odelProto\022-\n\010metadata\030\001 \001(\0132\033.tribuo.cor" +
      "e.ModelDataProto\0222\n\005model\030\002 \003(\0132#.tribuo" +
      ".common.libsvm.SVMModelProto\022\r\n\005means\030\004 " +
      "\003(\001\022\021\n\tvariances\030\005 \003(\001\022\024\n\014standardized\030\006" +
      " \001(\010B\'\n#org.tribuo.regression.libsvm.pro" +
      "tosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tribuo.protos.core.TribuoCore.getDescriptor(),
          org.tribuo.common.libsvm.protos.TribuoLibsvm.getDescriptor(),
        });
    internal_static_tribuo_regression_libsvm_LibSVMRegressionModelProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tribuo_regression_libsvm_LibSVMRegressionModelProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_regression_libsvm_LibSVMRegressionModelProto_descriptor,
        new java.lang.String[] { "Metadata", "Model", "Means", "Variances", "Standardized", });
    org.tribuo.protos.core.TribuoCore.getDescriptor();
    org.tribuo.common.libsvm.protos.TribuoLibsvm.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
