FROM openjdk:8
ADD target/mydocker.jar mydocker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "mydocker.jar"]