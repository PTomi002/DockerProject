FROM openjdk:11-ea-17-jdk-sid
WORKDIR /resources
ADD . /resources
EXPOSE 8080
ENV echoserver.environment ProductionWorld
CMD ["java", "-jar", "EchoServer.jar"]