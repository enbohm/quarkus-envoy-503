FROM gcr.io/distroless/java:11

WORKDIR /app
COPY target/lib /app/lib
ADD target/quarkus-runner.jar /app

CMD ["/app/quarkus-runner.jar"]