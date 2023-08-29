#!/bin/sh
mvn clean package && docker build -t com.polsl/kalkulator6 .
docker rm -f kalkulator6 || true && docker run -d -p 9080:9080 -p 9443:9443 --name kalkulator6 com.polsl/kalkulator6