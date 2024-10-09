package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: job_listing_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class JobListingServiceGrpc {

  private JobListingServiceGrpc() {}

  public static final String SERVICE_NAME = "joblistingservice.JobListingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.ListAllJobsRequest,
      com.example.grpc.ListAllJobsResponse> getListAllJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAllJobs",
      requestType = com.example.grpc.ListAllJobsRequest.class,
      responseType = com.example.grpc.ListAllJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.ListAllJobsRequest,
      com.example.grpc.ListAllJobsResponse> getListAllJobsMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.ListAllJobsRequest, com.example.grpc.ListAllJobsResponse> getListAllJobsMethod;
    if ((getListAllJobsMethod = JobListingServiceGrpc.getListAllJobsMethod) == null) {
      synchronized (JobListingServiceGrpc.class) {
        if ((getListAllJobsMethod = JobListingServiceGrpc.getListAllJobsMethod) == null) {
          JobListingServiceGrpc.getListAllJobsMethod = getListAllJobsMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.ListAllJobsRequest, com.example.grpc.ListAllJobsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAllJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ListAllJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ListAllJobsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobListingServiceMethodDescriptorSupplier("ListAllJobs"))
              .build();
        }
      }
    }
    return getListAllJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.GetJobDetailsRequest,
      com.example.grpc.GetJobDetailsResponse> getGetJobDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobDetails",
      requestType = com.example.grpc.GetJobDetailsRequest.class,
      responseType = com.example.grpc.GetJobDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.GetJobDetailsRequest,
      com.example.grpc.GetJobDetailsResponse> getGetJobDetailsMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.GetJobDetailsRequest, com.example.grpc.GetJobDetailsResponse> getGetJobDetailsMethod;
    if ((getGetJobDetailsMethod = JobListingServiceGrpc.getGetJobDetailsMethod) == null) {
      synchronized (JobListingServiceGrpc.class) {
        if ((getGetJobDetailsMethod = JobListingServiceGrpc.getGetJobDetailsMethod) == null) {
          JobListingServiceGrpc.getGetJobDetailsMethod = getGetJobDetailsMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.GetJobDetailsRequest, com.example.grpc.GetJobDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GetJobDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GetJobDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobListingServiceMethodDescriptorSupplier("GetJobDetails"))
              .build();
        }
      }
    }
    return getGetJobDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobListingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobListingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobListingServiceStub>() {
        @java.lang.Override
        public JobListingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobListingServiceStub(channel, callOptions);
        }
      };
    return JobListingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobListingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobListingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobListingServiceBlockingStub>() {
        @java.lang.Override
        public JobListingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobListingServiceBlockingStub(channel, callOptions);
        }
      };
    return JobListingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobListingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobListingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobListingServiceFutureStub>() {
        @java.lang.Override
        public JobListingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobListingServiceFutureStub(channel, callOptions);
        }
      };
    return JobListingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JobListingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listAllJobs(com.example.grpc.ListAllJobsRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.ListAllJobsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAllJobsMethod(), responseObserver);
    }

    /**
     */
    public void getJobDetails(com.example.grpc.GetJobDetailsRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GetJobDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListAllJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.ListAllJobsRequest,
                com.example.grpc.ListAllJobsResponse>(
                  this, METHODID_LIST_ALL_JOBS)))
          .addMethod(
            getGetJobDetailsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.GetJobDetailsRequest,
                com.example.grpc.GetJobDetailsResponse>(
                  this, METHODID_GET_JOB_DETAILS)))
          .build();
    }
  }

  /**
   */
  public static final class JobListingServiceStub extends io.grpc.stub.AbstractAsyncStub<JobListingServiceStub> {
    private JobListingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobListingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobListingServiceStub(channel, callOptions);
    }

    /**
     */
    public void listAllJobs(com.example.grpc.ListAllJobsRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.ListAllJobsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAllJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJobDetails(com.example.grpc.GetJobDetailsRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GetJobDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobListingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobListingServiceBlockingStub> {
    private JobListingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobListingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobListingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.ListAllJobsResponse listAllJobs(com.example.grpc.ListAllJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAllJobsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.GetJobDetailsResponse getJobDetails(com.example.grpc.GetJobDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobListingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<JobListingServiceFutureStub> {
    private JobListingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobListingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobListingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.ListAllJobsResponse> listAllJobs(
        com.example.grpc.ListAllJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAllJobsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GetJobDetailsResponse> getJobDetails(
        com.example.grpc.GetJobDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ALL_JOBS = 0;
  private static final int METHODID_GET_JOB_DETAILS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobListingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobListingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_ALL_JOBS:
          serviceImpl.listAllJobs((com.example.grpc.ListAllJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.ListAllJobsResponse>) responseObserver);
          break;
        case METHODID_GET_JOB_DETAILS:
          serviceImpl.getJobDetails((com.example.grpc.GetJobDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GetJobDetailsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class JobListingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobListingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.JobListingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobListingService");
    }
  }

  private static final class JobListingServiceFileDescriptorSupplier
      extends JobListingServiceBaseDescriptorSupplier {
    JobListingServiceFileDescriptorSupplier() {}
  }

  private static final class JobListingServiceMethodDescriptorSupplier
      extends JobListingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobListingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (JobListingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobListingServiceFileDescriptorSupplier())
              .addMethod(getListAllJobsMethod())
              .addMethod(getGetJobDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
