FROM amazoncorretto:11-alpine

ENV APPLICATION_USER ktor
RUN adduser -D -g '' $APPLICATION_USER

RUN mkdir /app
RUN chown -R $APPLICATION_USER /app

USER $APPLICATION_USER

COPY ./build/libs/nest-rest-1.0-all.jar /app/nest-rest.jar
WORKDIR /app

CMD ["java", "-server", "-jar", "nest-rest.jar"]
