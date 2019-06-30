#!/bin/bash

JAR_FILE="/home/sandokan/Github/sandokandias/spring-boot-elastic-apm/target/spring-boot-elastic-apm-0.0.1-SNAPSHOT.jar"

java -javaagent:/home/sandokan/Github/sandokandias/spring-boot-elastic-apm/elastic-apm-agent-1.7.0.jar -Delastic.apm.server_url=http://0.0.0.0:8300 -Delastic.apm.metrics_interval=0s -Delastic.apm.service_name=spring-boot-elastic-apm -Delastic.apm.application_packages=com.github.sandokandias.springbootapmagent.controller -Delastic.apm.capture_body=transactions -jar $JAR_FILE
