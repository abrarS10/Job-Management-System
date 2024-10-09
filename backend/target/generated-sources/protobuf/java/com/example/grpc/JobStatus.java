// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job_listing_service.proto

package com.example.grpc;

/**
 * Protobuf enum {@code joblistingservice.JobStatus}
 */
public enum JobStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEFAULT = 0;</code>
   */
  DEFAULT(0),
  /**
   * <code>RUNNING = 1;</code>
   */
  RUNNING(1),
  /**
   * <code>COMPLETED = 2;</code>
   */
  COMPLETED(2),
  /**
   * <code>SUBMITTED = 3;</code>
   */
  SUBMITTED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DEFAULT = 0;</code>
   */
  public static final int DEFAULT_VALUE = 0;
  /**
   * <code>RUNNING = 1;</code>
   */
  public static final int RUNNING_VALUE = 1;
  /**
   * <code>COMPLETED = 2;</code>
   */
  public static final int COMPLETED_VALUE = 2;
  /**
   * <code>SUBMITTED = 3;</code>
   */
  public static final int SUBMITTED_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static JobStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JobStatus forNumber(int value) {
    switch (value) {
      case 0: return DEFAULT;
      case 1: return RUNNING;
      case 2: return COMPLETED;
      case 3: return SUBMITTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JobStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      JobStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<JobStatus>() {
          public JobStatus findValueByNumber(int number) {
            return JobStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.example.grpc.JobListingServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final JobStatus[] VALUES = values();

  public static JobStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private JobStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:joblistingservice.JobStatus)
}

