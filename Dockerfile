from openjdk
COPY ./src/main/java /src
RUN javac /src/org/example/Main.java /src/org/example/Calculator.java
ENTRYPOINT ["java", "-cp", "/src", "org.example.Main"]

