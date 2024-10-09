package com.example.grpc;
import com.google.protobuf.util.JsonFormat;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.example.grpc.JobListingServiceGrpc;
import com.example.grpc.JobListingServiceGrpc.JobListingServiceBlockingStub;
import com.example.grpc.GetJobDetailsRequest;
import com.example.grpc.GetJobDetailsResponse;
import com.example.grpc.ListAllJobsRequest;
import com.example.grpc.ListAllJobsResponse;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class HttpGatewayServer {
    private static final Logger logger = Logger.getLogger(HttpGatewayServer.class.getName());
    private static final int HTTP_PORT = 8081;
    private static final int GRPC_PORT = 8080;

    public static void main(String[] args) throws IOException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", GRPC_PORT)
                .usePlaintext()
                .build();

        JobListingServiceBlockingStub jobListingServiceStub = JobListingServiceGrpc.newBlockingStub(channel);

        // Set up the HTTP server
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(HTTP_PORT), 0);
        httpServer.createContext("/list-all-jobs", new ListAllJobsHandler(jobListingServiceStub));
        httpServer.createContext("/get-job-details", new GetJobDetailsHandler(jobListingServiceStub));
        httpServer.setExecutor(null);
        httpServer.start();

        logger.info("HTTP server started on port " + HTTP_PORT);
    }

    static class ListAllJobsHandler implements HttpHandler {
        private final JobListingServiceBlockingStub stub;

        ListAllJobsHandler(JobListingServiceBlockingStub stub) {
            this.stub = stub;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("GET".equals(exchange.getRequestMethod())) {
                ListAllJobsRequest request = ListAllJobsRequest.newBuilder().build();
                ListAllJobsResponse response = stub.listAllJobs(request);

                String jsonResponse = response.toString();  // Convert the response to JSON if needed
                exchange.getResponseHeaders().set("Content-Type", "application/json");
                exchange.sendResponseHeaders(200, jsonResponse.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(jsonResponse.getBytes());
                os.close();
            } else {
                exchange.sendResponseHeaders(405, -1);  // 405 Method Not Allowed
            }
        }
    }

    static class GetJobDetailsHandler implements HttpHandler {
        private final JobListingServiceBlockingStub stub;

        GetJobDetailsHandler(JobListingServiceBlockingStub stub) {
            this.stub = stub;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("GET".equals(exchange.getRequestMethod())) {
                // Extract jobId from the query parameter
                String query = exchange.getRequestURI().getQuery();
                String jobId = query != null && query.startsWith("jobId=") ? query.substring(6) : "";

                GetJobDetailsRequest request = GetJobDetailsRequest.newBuilder().setJobId(jobId).build();
                GetJobDetailsResponse response = stub.getJobDetails(request);

                String jsonResponse = response.toString();  // Convert the response to JSON if needed
                exchange.getResponseHeaders().set("Content-Type", "application/json");
                exchange.sendResponseHeaders(200, jsonResponse.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(jsonResponse.getBytes());
                os.close();
            } else {
                exchange.sendResponseHeaders(405, -1);  // 405 Method Not Allowed
            }
        }
    }
}



