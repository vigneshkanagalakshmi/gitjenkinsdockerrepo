FROM openjdk:8
ADD build/libs/gitjenkinsdockerrepo-0.0.1-SNAPSHOT.jar gitjenkinsdockerrepo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/gitjenkinsdockerrepo-0.0.1-SNAPSHOT.jar"]