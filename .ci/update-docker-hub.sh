#!/bin/bash

. .ci/constants.sh

./gradlew build

docker build -t ${IMAGE} .
docker push ${IMAGE}