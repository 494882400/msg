FROM tomcat
MAINTAINER leiyf
ADD /home/java msg-0.0.2-SNAPSHOT.jar /data/
CMD java -jar msg-0.0.2-SNAPSHOT.jar