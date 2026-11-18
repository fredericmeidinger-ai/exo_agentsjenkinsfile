FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/*.jar jenkinsAgent.jar

CMD [ "java", "-jar", "jenkinsAgent.jar" ]



