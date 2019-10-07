# Build
FROM openjdk:8-jdk-alpine AS builder

WORKDIR /app

COPY . /app
RUN ./gradlew clean bootJar --no-daemon

# Run
FROM openjdk:8-jre-alpine

COPY --from=builder /app/build/libs/*-0.0.1-SNAPSHOT.jar /app/app.jar
ADD entrypoint.sh /bin/entrypoint.sh
WORKDIR /app
EXPOSE 8080

CMD ["/bin/entrypoint.sh"]
