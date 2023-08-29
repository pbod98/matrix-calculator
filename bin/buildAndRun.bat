@echo off
call mvn clean package
call docker build -t com.polsl/kalkulator6 .
call docker rm -f kalkulator6
call docker run -d -p 9080:9080 -p 9443:9443 --name kalkulator6 com.polsl/kalkulator6