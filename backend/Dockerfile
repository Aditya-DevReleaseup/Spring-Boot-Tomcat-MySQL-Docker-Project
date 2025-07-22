# Build stage: use Maven to package your Spring Boot app
FROM maven:3.8.7-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Run stage: plain OpenJDK, copy the built jar
FROM openjdk:17-jdk
WORKDIR /app
# Adjust the name below to *match the jar output* of your project
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
