#!/bin/bash

PID=$1
java -jar apm-agent-attach-1.7.0.jar --pid $PID --config 'capture_body=transactions;metrics_interval=0s'
