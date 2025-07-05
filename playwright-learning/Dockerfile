FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean test-compile

FROM mcr.microsoft.com/playwright/java:v1.51.0-noble
WORKDIR /app
COPY --from=build /app .
CMD ["mvn", "test"]