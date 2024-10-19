FROM openjdk:17-jdk-slim
LABEL authors="noj2304"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ms-store.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar","/ms-store.jar"]