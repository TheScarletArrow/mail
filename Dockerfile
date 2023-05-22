FROM eclipse-temurin:19-alpine
COPY build/libs/mail-sender-latest-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]