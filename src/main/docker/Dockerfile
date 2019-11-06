# FROM openjdk:8-jdk-alpine
FROM frolvlad/alpine-java:jdk8-slim
VOLUME /tmp
ADD spring-boot-docker-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]