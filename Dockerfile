FROM tomcat:10-jdk17
ADD target/MyJavaWeb-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/hello.war
EXPOSE 8080
CMD ["catalina.sh", "run"]