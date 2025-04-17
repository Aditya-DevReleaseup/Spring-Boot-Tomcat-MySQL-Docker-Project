# Stage 1: Build the JAR  // mutli-stage-dockerfile
FROM maven:3.9.4-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the app
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=builder /app/target/springboot-tomcat-app.jar app.jar
VOLUME /app/logs
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]