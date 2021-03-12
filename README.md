# docker-test

## Overview
This is a skeleton project for running api tests in a Docker container. The base project is a Java Gradle test project.
The project is mounted as a volume to a base openjdk 8 image and executed with the Gradle Wrapper. The project can be
built using the included makefile using the test directive. It will execute the Docker run command below:

```docker run --rm -v /mnt/c/Users/Harit/DockerTest:/workspace -w /workspace openjdk:8 ./gradlew test --no-daemon```
