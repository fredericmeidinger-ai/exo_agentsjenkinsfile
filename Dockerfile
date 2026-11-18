FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/*.jar jenkinsAgent.jar

EXPOSE 8080

CMD [ "java", "-jar", "jenkinsAgent.jar" ]



