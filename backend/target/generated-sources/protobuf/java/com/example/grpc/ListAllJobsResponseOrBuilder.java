// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job_listing_service.proto

package com.example.grpc;

public interface ListAllJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:joblistingservice.ListAllJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .joblistingservice.Job jobs = 1;</code>
   */
  java.util.List<com.example.grpc.Job> 
      getJobsList();
  /**
   * <code>repeated .joblistingservice.Job jobs = 1;</code>
   */
  com.example.grpc.Job getJobs(int index);
  /**
   * <code>repeated .joblistingservice.Job jobs = 1;</code>
   */
  int getJobsCount();
  /**
   * <code>repeated .joblistingservice.Job jobs = 1;</code>
   */
  java.util.List<? extends com.example.grpc.JobOrBuilder> 
      getJobsOrBuilderList();
  /**
   * <code>repeated .joblistingservice.Job jobs = 1;</code>
   */
  com.example.grpc.JobOrBuilder getJobsOrBuilder(
      int index);
}
