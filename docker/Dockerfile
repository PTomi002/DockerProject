# Base docker image in repository
FROM openjdk:11-ea-17-jdk-sid
# Create a work dir within the container
WORKDIR /resources
# Add the needed resources to the work dir
ADD . /resources
# Expose the required ports to the host amchine
EXPOSE 8080
# Set environmental variables
ENV echoserver.environment ProductionWorld
# Initiate commands
CMD ["java", "-jar", "EchoServer.jar"]