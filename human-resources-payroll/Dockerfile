FROM openjdk:11
VOLUME /tmp
ADD ./target/human-resources-payroll-0.0.1-SNAPSHOT.jar human_resources_payroll.jar
ENTRYPOINT ["java","-jar","/human_resources_payroll.jar"]