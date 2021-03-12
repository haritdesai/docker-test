FROM openjdk:8
COPY . /
WORKDIR /
CMD ["./gradlew", "test", "--no-daemon"]