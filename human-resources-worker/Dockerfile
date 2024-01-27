FROM openjdk:11
VOLUME /tmp
ADD ./target/human-resources-worker-0.0.1-SNAPSHOT.jar human-resources-worker.jar
ENTRYPOINT ["java","-jar","/human-resources-worker.jar"]