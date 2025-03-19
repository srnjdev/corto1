# Etapa 1: Construcción
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app

# Anulamos MAVEN_CONFIG para evitar problemas de interpretación
ENV MAVEN_CONFIG=""

# Copiamos la carpeta .mvn (con el Maven Wrapper), mvnw y pom.xml
COPY .mvn/ .mvn/
COPY mvnw pom.xml ./
RUN chmod +x mvnw

# Descarga las dependencias sin ejecutar tests
RUN ./mvnw dependency:go-offline

# Copia el código fuente y compila la aplicación (limpia y empaqueta)
COPY src/ src/
RUN ./mvnw clean package -DskipTests

# Etapa 2: Imagen final para ejecución
FROM openjdk:17-slim
WORKDIR /app

# Copia el JAR generado en la etapa build
COPY --from=build /app/target/*.jar app.jar

# Expone el puerto en el que corre la aplicación (por defecto 8080)
EXPOSE 8080

# Comando para iniciar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
