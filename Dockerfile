FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD target/demo*.jar /app.jar
CMD ["java","-jar","/app.jar"]
EXPOSE 8081