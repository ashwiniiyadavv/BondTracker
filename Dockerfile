FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/bond-tracker-1.0-SNAPSHOT.jar /app/bond-tracker.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "bond-tracker.jar"]
