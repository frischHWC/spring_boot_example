#!/usr/bin/env bash

echo "Remove old containers"
dev-support/scripts/teardown_dockers.sh

echo "Build docker containers"
docker build -t spring_boot_example -f dev-support/docker/Dockerfile .

echo "Launch docker containers"
docker run -d -p 8080:8080 --name spring_boot_example spring_boot_example

