FROM jingyuzhao/jdk1.8:test
MAINTAINER czy<wangjiu2019@gmail.com>
ADD ./Blog-0.0.1-SNAPSHOT.jar /app.jar
VOLUME "/log"
EXPOSE 8081
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar $JAVA_OPTION /app.jar"]