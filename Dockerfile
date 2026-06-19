FROM openjdk:17

COPY target/demo-app.jar /usr/app/

WORKDIR 8080

ENTRYPOINT ["java","-jar","demo-app.jar"]