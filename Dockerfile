
FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-web.war spring-boot-web.war
ENTRYPOINT ["java","-jar","/spring-boot-web.war"]
