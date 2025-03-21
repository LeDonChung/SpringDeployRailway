FROM openjdk:17-jdk-slim


WORKDIR /app

COPY /target/SpringDeployRailway-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9097

ENTRYPOINT ["java", "-jar", "app.jar"]