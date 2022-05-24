Run project:
1. ./mvnw clean package -DskipTests
2. cp target/demo-0.0.1-SNAPSHOT.jar src/main/docker
3. cd src/main/docker
4. docker-compose build
5. docker-compose up
