FROM openjdk:8
EXPOSE 8080

ADD /target/addPayee.jar addPayee.jar

ENTRYPOINT ["java","-jar","addPayee.jar"]