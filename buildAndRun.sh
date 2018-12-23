#!/bin/sh
mvn clean package && docker build -t com.asniaire/release-info-exposer .
docker rm -f release-info-exposer || true && docker run -d -p 8080:8080 -p 4848:4848 --name release-info-exposer com.asniaire/release-info-exposer
