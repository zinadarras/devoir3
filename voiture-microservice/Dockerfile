#Start with a base image containing Java runtime
FROM openjdk:21-rc
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="zaina.com"
# Add the application's jar to the image
COPY target/voiture-microservice-0.0.1-SNAPSHOT.jar voiture-microservice-0.0.1-SNAPSHOT.jar
# execute the application
ENTRYPOINT ["java", "-jar", "voiture-microservice-0.0.1-SNAPSHOT.jar"]