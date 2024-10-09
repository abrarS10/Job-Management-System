//package com.example.grpc;
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import com.example.grpc.JobListingServiceGrpc;
//import com.example.grpc.YourRequest;
//import com.example.grpc.YourResponse;
//import org.glassfish.grizzly.http.server.HttpServer;
//import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
//import org.glassfish.jersey.server.ResourceConfig;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
//import javax.ws.rs.core.MediaType;
//import java.net.URI;
//
//@Path("/job-listing")
//public class JobListingGatewayResource {
//    private final JobListingServiceGrpc.JobListingServiceBlockingStub grpcClient;
//
//    public JobListingGatewayResource() {
//        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
//                .usePlaintext() // Disable TLS for testing purposes
//                .build();
//        grpcClient = JobListingServiceGrpc.newBlockingStub(channel);
//    }
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getJobListing(@QueryParam("name") String name) {
//        // Create a gRPC request
//        System.out.println("Received request for name: " + name); // Add this line
//
//        YourRequest request = YourRequest.newBuilder().setName(name).build();
//
//        // Call the gRPC service and get the response
//        YourResponse grpcResponse = grpcClient.yourMethod(request);
//
//        // Convert gRPC response to JSON response for the REST API
//        return "{\"message\": \"" + grpcResponse.getMessage() + "\"}";
//    }
//
//    public static void main(String[] args) {
//        URI baseUri = URI.create("http://localhost:8081/");
//        ResourceConfig config = new ResourceConfig(JobListingGatewayResource.class);
//        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(baseUri, config);
//
//        System.out.println("HTTP/gRPC gateway started at " + baseUri);
//    }
//}
