FROM gradle:8.7-jdk21 AS builder
WORKDIR /app
COPY . .
RUN gradle build --no-daemon


FROM azul/zulu-openjdk:21.0.8-jdk

WORKDIR /app

COPY --from=builder /app/build/libs/*.jar /app/agendador-tarefas.jar


EXPOSE 8082

CMD ["java", "-jar", "/app/agendador-tarefas.jar"]