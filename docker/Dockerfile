FROM openjdk:8
MAINTAINER czy<wangjiu2019@gmail.com>
VOLUME /tmp
ADD ../target/Blog-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
VOLUME /logs
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar $JAVA_OPTION /app.jar"]