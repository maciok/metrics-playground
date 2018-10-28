# metrics-playground

This project is meant to create POC of Java 10, SpringBoot 2 + metrics project.


### How to run

```
./gradlew clean build
docker-compose build
docker-compose up
```

### What will be running?
Docker will start:
* sample Java app with exposed *prometheus* metrics endpoint
* *prometheus* itself
* *Grafana* to visualise metrics
* *Logstash*, *Elasticsearch*, *Kibana* to analyse logs
