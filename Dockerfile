FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY .mvn .mvn
COPY mvnw mvnw
COPY pom.xml .
RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline -B
COPY src src
RUN ./mvnw clean package -DskipTests
# The container listens on the port defined by the PORT environment variable (Render assigns it).
# EXPOSE 8083 is only documentary; Render ignores it.
EXPOSE 8083
CMD ["java", "-jar", "target/Inquiry-0.0.1-SNAPSHOT.jar"]