FROM openjdk:latest

ADD target/welcome-docker-app-0.0.1-SNAPSHOT.jar welcome-docker.jar

ENTRYPOINT ["java", "-jar", "welcome-docker.jar"]

EXPOSE 8901