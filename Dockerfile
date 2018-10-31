FROM openjdk:10-jdk
ADD /target/friendsBookStackroute-0.0.1-SNAPSHOT.jar /dockerfs/app/friendsBookStackroute-0.0.1-SNAPSHOT.jar
WORKDIR /dockerfs/app
ENTRYPOINT ["java","-jar","friendsBookStackroute-0.0.1-SNAPSHOT.jar"]