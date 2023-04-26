FROM openjdk:8-jre
WORKDIR /app
ENV JAVA_OPTS -Xms700m -Xmx700m
ADD msg-0.0.3-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT [ "java" , "-jar" ]
CMD ["app.jar"]