# Etapa 1: Compilación
FROM maven:3.9.4-eclipse-temurin-17 AS build
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests

# Etapa 2: Imagen final mínima
FROM eclipse-temurin:24-alpine
COPY --from=build /app/target/*.jar bikecomparator.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "bikecomparator.jar"]
