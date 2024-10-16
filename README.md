﻿# Job-Management-System

## Overview

A simple job management system with a backend built using gRPC and a frontend using Vue.js. The backend contains an http/gRPC gateway which acts as the intermediary, allowing the frontend to make http calls to connect to the gRPC server. 

## Technologies Used

- **Backend:** gRPC with http gateway using Java
- **Frontend:** Vue.js


## Prerequisites

Make sure you have the following installed:

- Java 11 or higher
- Maven 3.6 or higher
- Node.js 14 or higher
- npm (comes with Node.js)

## Setup Instructions

### Backend

1. Navigate to the `backend` directory:

   ```bash
   cd backend
   mvn clean install
   java -cp target/job-management-system-backend-1.0-SNAPSHOT.jar com.example.grpc.GrpcServer
   java -cp target/job-management-system-backend-1.0-SNAPSHOT.jar com.example.grpc.HttpGatewayServer

2. Navigate to the `frontend`
   ```bash
   npm install
   cd job-management-system
   npm run serve

3. Now open http://localhost:3000 to view the page with the list of jobs.
