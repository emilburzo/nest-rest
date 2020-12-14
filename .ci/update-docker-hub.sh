#!/bin/bash

./gradlew build

docker build -t emilburzo/nest-rest .
docker push emilburzo/nest-rest