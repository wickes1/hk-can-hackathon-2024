Pre-requisite for running the program:
- Startup database
  - use docker/docker-compose.yml file to start localhost database OR
  - use Vercel to create serverless PostgreSQL
- Setup Java JDK 1.8
  - Java 1.8 JDK (32bit) (through the link: https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=416&field_operating_system_target_id=436&field_architecture_target_id=386&field_java_package_target_id=All)
  - Set JAVA_HOME point to the extracted JDK
- Include "JACOB - Java COM Bridge" library dll to JDK bin
  - Copy "/libs/jacob-1.19-x64.dll" to installed Java 1.8 directory (for example: "C:\Java\java-1.8\bin")

Building the application (Maven)
- change environment setting (spring.profiles.active) in file /src/main/resources/application.properties
  - "local" for localhost
  - "prod" for production
- mvn initialize (to install "JACOB - Java COM Bridge" library jar from /libs/jacob.jar to local Maven repository)
- mvn clean
- mvn install
- a compiled jar will be built after execution of the process

Running the application
- Run QuickBook application
- Run database
- Running application in IntelliJ
  - By simply run the program by "Run > Run 'QuickBookDemoApplication'"
  - By maven command "mvn spring-boot:run"
- Running application using startup.bat
  - located in /bat/startup.bat
  - copy startup.bat to another directory, says "/tmp/directory"
  - copy built jar /target/backend-sync-0.0.1-SNAPSHOT.jar to "/tmp/directory"
  - change environment setting in /bat/startup.bat
  - click /bat/startup.bat and run