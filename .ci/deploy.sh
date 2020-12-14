#!/bin/bash

NAME="nest-rest"
IMAGE="emilburzo/nest-rest:latest"
PORT="8467"

docker pull ${IMAGE}
docker stop ${NAME}
docker rm ${NAME}
docker run -d --restart=always --name ${NAME} -p ${PORT}:8080 ${IMAGE}
