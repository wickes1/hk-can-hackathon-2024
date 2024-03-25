Reference:
- https://molecularbear.com/blog/using-the-quickbooks-sdk-via-jacob-java-com-bridge/
- https://www.youtube.com/watch?v=yenpA-6Q3gs

In order to run the program successfully, Pre-requisite:
- Java 1.8 (32 bit) should be set as the Project SDK
  - Download Java 1.8 JDK (32bit) (through the link: https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=416&field_operating_system_target_id=436&field_architecture_target_id=386&field_java_package_target_id=All)
  - Extract the downloaded zip to a directory
  - Set Project JDK to the directory, for IntelliJ ("File > Project Structures > Project Setting > Project")
- Configuration for the library "JACOB - Java COM Bridge"
  - Add "JACOB - Java COM Bridge" library jar (located in /libs/jacob.jar) as project dependency (In Intellij, "File > Project Structures > Project Settings > Modules > "+")
  - Copy "/libs/jacob-1.19-x64.dll" to installed Java 1.8 directory (for example: "C:\Java\java-1.8\bin")
- Download and install QuickBook SDK
  - through the link: https://static.developer.intuit.com/resources/QBSDK160.exe

Some process done for development of this toy program:
- Assuming QuickBook Company was created, and QuickBook application was running
- Copy XML schemas after installation of QuickBook SDK to /xsdSchema folder in the project 
  - For example, Directory storing the xsd files: C:\Program Files (x86)\Intuit\IDN\Common\tools\validator 
  - In this toy program, schema version 14 was used (i.e. file suffix as xxxxx140.xsd)
- Generate Java class using JAXB function in Java SDK 
  - for example if installing the Java 1.8 in C:/Java/java-1.8 
  - JAXB command was located in C:/Java/java-1.8/xjc.exe 
  - Run the function as:
    - xjc -d "<path in project to generate the Java class>" -p <package name> "<project path>\xsdSchema\qbxmlops140.xsd"
    - for example: ./xjc -d "C:\Playground\hackathon\QBDemo\src\main\java\com\hackathon\QBDemo\model" -p com.hackathon.QBDemo.model.xml "C:\Playground\hackathon\QBDemo\xsdSchema\qbxmlops140.xsd"