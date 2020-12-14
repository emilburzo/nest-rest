#!/bin/bash

protoc --java_out=./src/main/java/ -I ./ $(find protobuf -name \*.proto | tr '\n' ' ')