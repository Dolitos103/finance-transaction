# Imagem base com o Java 8 instalado
FROM openjdk:8-jre-alpine

# Diretório de trabalho
WORKDIR /app

# Copia o JAR da aplicação para o diretório /app
COPY target/springboot-0.0.1-SNAPSHOT.jar /app

# Porta em que a aplicação irá rodar
EXPOSE 8080

# Comando para executar a aplicação quando o contêiner for iniciado
CMD ["java", "-jar", "springboot-0.0.1-SNAPSHOT.jar"]