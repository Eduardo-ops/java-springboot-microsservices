FROM openjdk:11
VOLUME /tmp
ADD ./target/human_resources_user-0.0.1-SNAPSHOT.jar human_resources_user.jar
ENTRYPOINT ["java","-jar","/human_resources_user.jar"]