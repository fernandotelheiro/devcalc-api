# Imagem base com Java 17 (apenas JRE)
FROM eclipse-temurin:17-jre-jammy

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o JAR "gordo" gerado pelo Maven para dentro da imagem
COPY target/devcalc-api-1.0-SNAPSHOT.jar app.jar

# Expõe a porta usada pela aplicação
EXPOSE 7000

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
