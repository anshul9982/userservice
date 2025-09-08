FROM eclipse-temurin:21-jre
WORKDIR /app
COPY ../jars/userservice.jar app.jar
EXPOSE 9899
CMD ["java", "-jar", "app.jar"]