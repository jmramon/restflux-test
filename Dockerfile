FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/restflux-test-0.1.0.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar /app.jar --debug
EXPOSE 9090