-Added Spring Boot support
-Added envPC properties file and Properties Bean initialization
-Added Java EE API and EJB support
-Added EJB implementation
-Added Rest Template support
-Added Mensajeria Service implementation

-To generate the jar for the project just run mvn package from the command line. This is thanks to the following lines added to the pom:
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>