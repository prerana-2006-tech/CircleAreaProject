
FROM maven:3.9.9-eclipse-temurin-17

WORKDIR /app

COPY pom.xml .
COPY src ./src

# Execute JUnit tests
RUN mvn clean test

# Run tests when the container starts
CMD ["mvn", "test"]
