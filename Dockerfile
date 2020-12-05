FROM openjdk:8
ADD target/spring-boot-hello.jar spring-boot-hello.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/spring-boot-hello.jar"]