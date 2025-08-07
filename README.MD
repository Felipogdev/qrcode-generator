# QR Code Generator

A robust RESTful service for generating QR codes and storing them in AWS S3, built with Java, Spring Boot, and Docker.

## Tech Stack

- **Java 21**: Core programming language.
- **Spring Boot**: Application framework for building REST APIs.
- **AWS S3**: Cloud storage for generated QR code images.
- **Docker**: Containerization for easy deployment.
- **Maven**: Build and dependency management.
- **ZXing**: Library for QR code generation.

## Features

- Generate QR codes from any text input.
- Store generated QR codes as PNG images in a specified AWS S3 bucket.
- Retrieve a direct URL to the uploaded QR code image.

## Getting Started

### Prerequisites

- Java 21+
- Maven
- Docker (optional, for containerized deployment)
- AWS account with an S3 bucket and proper credentials

### Configuration

Configure your AWS credentials and bucket via environment variables or in your deployment platform:

- `AWS_ACCESS_KEY_ID`: Your AWS access key.
- `AWS_SECRET_ACCESS_KEY`: Your AWS secret key.
- `AWS_REGION`: The AWS region for your S3 bucket (e.g., `eu-north-1`).
- `AWS_BUCKET_NAME`: The name of your S3 bucket.

Alternatively, set them in your environment or `.env` file.

#### Using Maven

```bash
mvn clean package
java -jar target/*.jar
```

#### Using Docker
To build the project, make sure you have docker installed and then on the root of the project, runs

```bash

 docker build -t <name> .

 docker run --env-file .env -p 8080:8080 <name>
```

## Usage

### API Endpoint

**POST** `/qr-code`

**Request Body:**
```json
{
  "text": "https://example.com"
}
```

**Response:**
```json
{
  "url": "https://your-bucket.s3.your-region.amazonaws.com/uuid-filename"
}
```

- The `url` field contains a direct link to your generated QR code image in S3.

## Example cURL

```bash
curl -X POST http://localhost:8080/qr-code \
  -H "Content-Type: application/json" \
  -d '{"text": "https://example.com"}'
```

## Project Structure

- `controller/QrCodeController.java`: Exposes the REST endpoint.
- `service/QrCodeGeneratorService.java`: Generates and uploads the QR code.
- `infrastructure/S3StorageAdapter.java`: Handles AWS S3 storage.
- `dto/`: Data transfer objects for requests and responses.


---

_Results may be incomplete. [View more details in the GitHub UI.](https://github.com/Felipogdev/qrcode-generator/search)_
