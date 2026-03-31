# Use Java 17 (adjust if you're using another version)
FROM openjdk:27-ea-oraclelinux9

# Copy jar file
COPY target/electro-desk.jar electro-desk-app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "/electro-desk-app.jar"]