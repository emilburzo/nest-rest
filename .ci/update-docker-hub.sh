#!/bin/bash

set -eu

. .ci/constants.sh

./gradlew build

docker build -t ${IMAGE} .
docker push ${IMAGE}