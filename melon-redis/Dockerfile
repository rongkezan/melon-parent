FROM openjdk:8-jdk-slim
LABEL maintainer=keith

COPY target/*.jar /app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]