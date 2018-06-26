FROM openjdk:11-ea-17-jdk-sid
WORKDIR /resources
ADD . /resources
EXPOSE 80
ENV echoserver.environment ProductionWorld
CMD ["java", "-jar EchoServer.jar"]