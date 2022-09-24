FROM eclipse-temurin:18-jdk-focal
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY lib/ ./lib

RUN ./mvnw install:install-file \
   -Dfile=lib/credit-card-proto-1.0-SNAPSHOT.jar \
   -DgroupId=com.yoda \
   -DartifactId=credit-card-proto \
   -Dversion=1.0-SNAPSHOT \
   -Dpackaging=jar \
   -DgeneratePom=true

RUN ./mvnw dependency:go-offline -amd

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]