FROM maven:latest AS MAVEN_BUILD
COPY ./ ./
RUN mvn clean package
 
FROM openjdk:12-alpine
MAINTAINER Bruno Carvalho de Mariz <brunomcarvalho89@gmail.com>
WORKDIR /usr/src/app
COPY --from=MAVEN_BUILD /target/docker-lab-message-2-1.0.0.jar /usr/src/app
EXPOSE 8081
ENV SPRING_PROFILE_ACTIVE=prod
ENV MESSAGE_TEST_PROD="PROD ENVIROMENT 2"
ENV MESSAGE_TEST_DEV="DEV ENVIROMENT 2"
CMD ["java", "-jar", "docker-lab-message-2-1.0.0.jar"]