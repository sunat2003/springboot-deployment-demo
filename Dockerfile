# ------------ Build Stage ------------
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Set the working directory
WORKDIR /app

# Copy all project files
COPY . .

# Package the application (skip tests for faster build)
RUN mvn clean package -DskipTests

# ------------ Run Stage ------------
FROM eclipse-temurin:21-jdk

# Set the working directory
WORKDIR /app

# Copy the generated JAR from the build stage
COPY --from=build /app/target/SpringBootDeploymentDemo-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8000

# Command to run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
