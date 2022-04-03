#docker build -t liftup/forum .
#docker run liftup/forum
#devcenter.heroku.com.articles/container-registry-and-runtime

FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Xmx512m", "-Dserver.port=${PORT}", "-jar","/app.jar"]

#docker run -p 8090:8090 
-e SPRING_PROFILES_ACTIVE='prd' -e FORUM_DATABASE_URL='jdbc:h2:mem:liftup-forum' -e FORUM_DATABASE_USERNAME='sa' -e FORUM_DATABASE_PASSWORD='' -e FORUM_JWT_SECRET='123456' liftup/forum
