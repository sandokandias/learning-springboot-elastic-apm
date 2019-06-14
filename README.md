# spring-boot-elastic-apm

Sample spring boot application with some config files for POC of the Elastic APM Stack.

Execute the steps bellow:

1. Create a sample SpringBoot application
2. Download the library "apm-agent-attach-1.7.0.jar" from https://search.maven.org/search?q=g:co.elastic.apm%20AND%20a:apm-agent-attach&core=gav
3. Create a docker-compose.yml file and configure containers for (APM-Server, Elasticsearch, Kibana)
4. Execute 
```shell 
$docker-compose up
```
5. Run the application 
```shell 
$ java -jar target/spring-boot-elastic-apm-0.0.1-SNAPSHOT.jar
```
6. Get the PID of application
7. Install the agent 
```shell
$java -jar apm-agent-attach-1.7.0.jar --pid <pid> --config 'capture_body=all'
```
⋅⋅* **capture_body options**: _off, errors, transactions, all_
⋅⋅* For more information: https://www.elastic.co/guide/en/apm/agent/java/current/intro.html
8. Open kibana (http://localhost:5601)
9. Go to the "APM" item of the left menu
10. The name of the application will be displayed, click on it
11. Some monitoring data will be displayed
12. Send some requests 
```shell
curl -X POST \
  http://localhost:8080/payments \
  -H 'Content-Type: application/json' \
  -H 'X-Organization: zup' \
  -d '{
  "description": "Dados adicional 3GB",
  "amount": 1599,
  "currency": "BRL"
}'
```
13. Some seconds later the http request will be displayed on Kibana
