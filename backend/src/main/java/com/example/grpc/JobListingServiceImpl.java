package com.example.grpc;
import io.grpc.stub.StreamObserver;

import com.google.protobuf.Timestamp;
import io.grpc.stub.StreamObserver;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JobListingServiceImpl extends JobListingServiceGrpc.JobListingServiceImplBase {

    private final List<Job> jobList = new ArrayList<>();

    public JobListingServiceImpl() {
        jobList.add(Job.newBuilder()
                .setJobId("1")
                .setJobName("Job 1")
                .setJobStatus(JobStatus.SUBMITTED)
                .setCreatedAt(Timestamp.newBuilder().setSeconds(Instant.now().getEpochSecond()).build())
                .build());

        jobList.add(Job.newBuilder()
                .setJobId("2")
                .setJobName("Job 2")
                .setJobStatus(JobStatus.RUNNING)
                .setCreatedAt(Timestamp.newBuilder().setSeconds(Instant.now().getEpochSecond()).build())
                .build());

        jobList.add(Job.newBuilder()
                .setJobId("3")
                .setJobName("Job 3")
                .setJobStatus(JobStatus.COMPLETED)
                .setCreatedAt(Timestamp.newBuilder().setSeconds(Instant.now().getEpochSecond()).build())
                .build());
    }

    @Override
    public void listAllJobs(ListAllJobsRequest request, StreamObserver<ListAllJobsResponse> responseObserver) {

        ListAllJobsResponse response = ListAllJobsResponse.newBuilder()
                .addAllJobs(jobList)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getJobDetails(GetJobDetailsRequest request, StreamObserver<GetJobDetailsResponse> responseObserver) {
        Optional<Job> jobOptional = jobList.stream()
                .filter(job -> job.getJobId().equals(request.getJobId()))
                .findFirst();

        if (jobOptional.isPresent()) {
            GetJobDetailsResponse response = GetJobDetailsResponse.newBuilder()
                    .setJob(jobOptional.get())
                    .build();
            responseObserver.onNext(response);
        } else {
            responseObserver.onError(new Exception("Job not found with ID: " + request.getJobId()));
        }
        responseObserver.onCompleted();
    }
}
