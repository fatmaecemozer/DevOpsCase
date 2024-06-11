#base docker image definition
FROM openjdk:17
#add maintainer label metadata
LABEL maintainer="feo.devops"
#copy jar file from source to destination
ADD target/devopscase-0.0.1-SNAPSHOT.jar devopscase.jar
#expose on port 8080
EXPOSE 8080
#application execution command
ENTRYPOINT ["java","-jar","devopscase.jar"]