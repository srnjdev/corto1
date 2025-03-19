# Corto1 - Dockerización de Aplicación Spring Boot

Este proyecto es una aplicación Spring Boot dockerizada, compilada y ejecutada utilizando el Maven Wrapper dentro de contenedores Docker. La configuración sigue los lineamientos de la actividad "Dockerización y Versionado de Aplicaciones en Spring Boot".

## Requisitos

- Docker y Docker Compose instalados.
- Conexión a Internet para descargar imágenes y dependencias.

## Estructura del Proyecto

- **Dockerfile**: Define la compilación y ejecución de la aplicación en dos etapas utilizando Java 17.
- **docker-compose.yml**: Levanta los contenedores de la aplicación y, opcionalmente, de PostgreSQL.
- **pom.xml**: Configuración de Maven para el proyecto.
- **src/**: Código fuente de la aplicación.
- **.mvn/**, **mvnw** y **mvnw.cmd**: Archivos del Maven Wrapper.

## Instrucciones de Ejecución

1. **Construir y levantar la aplicación:**

   En la raíz del proyecto (donde se encuentran el Dockerfile y docker-compose.yml), ejecuta:

   ```bash
   docker compose up --build

## Probar la aplicación

Una vez que la aplicación esté en ejecución, abre tu navegador y dirígete a la siguiente URL:

```bash
http://localhost:8080/api/test/[nombre]@gmail
```

Reemplaza `[nombre]` por el nombre que desees probar (por ejemplo, `juan@gmail`).

## Verificación
Si ves el contenido en formato JSON, significa que el dato se ha ingresado correctamente y la aplicación está funcionando según lo esperado.

## Autor
Sergio Ramírez - Carnet `RJ23001`