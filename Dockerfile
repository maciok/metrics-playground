FROM openjdk:10.0.2-jdk
ARG JAR_HOME

RUN echo $JAR_HOME
ADD ${JAR_HOME:-build/libs}/metrics-*.jar /opt/system/

WORKDIR /opt/system

CMD java -jar metrics-*.jar -Dfile.encoding=UTF-8-Djava.security.egd=file: /dev/./urandom