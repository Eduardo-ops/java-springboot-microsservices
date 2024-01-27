FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/human-resources-eureka-server-0.0.1-SNAPSHOT.jar human-resources-eureka-server.jar
ENTRYPOINT ["java","-jar","/human-resources-eureka-server.jar"]