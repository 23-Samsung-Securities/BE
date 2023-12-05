FROM openjdk:17
COPY ./build/libs/samsung-0.0.1-SNAPSHOT.jar samsung.jar
ENTRYPOINT ["java", "-jar", "samsung.jar"]
