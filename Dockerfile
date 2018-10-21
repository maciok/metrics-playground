FROM openjdk:10.0.2-jdk

ARG JAR_HOME
ARG RUN_SCRIPT


ADD ${JAR_HOME:-build/libs}/metrics-*.jar /opt/system/
ADD ${RUN_SCRIPT:-docker/app/*} /opt/system/

WORKDIR /opt/system

CMD ./start.sh