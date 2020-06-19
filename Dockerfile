FROM adoptopenjdk/openjdk11:x86_64-ubuntu-jre-11.0.7_10
COPY ./build/libs/primeornot01-0.0.1-SNAPSHOT.jar /tmp
CMD "java" "-jar" "/tmp/primeornot01-0.0.1-SNAPSHOT.jar"
EXPOSE 8080
