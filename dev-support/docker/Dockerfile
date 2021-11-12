FROM openjdk:11
COPY target/spring_boot_example-0.0.1-SNAPSHOT.jar /project/spring_boot_example.jar
WORKDIR /project
CMD ["java", "-jar", "/project/spring_boot_example.jar"]
EXPOSE 8080/tcp