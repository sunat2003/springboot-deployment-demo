# Use a base image with Java runtime
FROM openjdk:21

# Set the working directory
WORKDIR /app

# Copy the JAR file and rename it to app.jar
COPY target/SpringBootDeploymentDemo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port (optional, helpful for local testing)
EXPOSE 8000

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
