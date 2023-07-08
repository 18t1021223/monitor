FROM adoptopenjdk/openjdk11:latest
#WORKDIR /pathology
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
# docker build -t api-doc-image .
# docker run -d --name docs -p 8014:8014 api-doc-image