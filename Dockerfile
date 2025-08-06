FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

ARG AWS_ACESS_KEY_ID
ARG AWS_SECRET_ACESS_KEY

ENV AWS_REGION=eu-north-1
ENV AWS_S3_BUCKET=qr-code-generatorz

ENTRYPOINT ["java", "-jar", "app.jar"]
