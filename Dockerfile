FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/bike_comparator-0.0.1.jar
COPY ${JAR_FILE} bike_comparator.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","bike_comparator.jar"]