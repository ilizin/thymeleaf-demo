# thymeleaf-demo

This demo project shows how easy is to build a web applications with springboot and thymeleaf.

Springboot is full of properties and annotations, find this code fully commented to document how to use a bunch of them.

**Annotations:** @Controller, @InitBinder, @GetMapping, @PostMapping, @Valid, @ModelAttribute, @Value, @RequestMapping,
@SpringBootApplication

Thymeleaf is a Java library. It is an XML/XHTML/HTML5 template engine able to apply a set of transformations to template files in order to display data and/or text produced by your applications.
It is better suited for serving XHTML/HTML5 in web applications, but it can process any XML file, be it in web or in standalone applications.
Thymeleaf can be integrated with the Spring Framework, especially (but not only) Spring MVC.

Thymeleaf is full of tags, find this code fully commented to document how to use a bunch of them.

**Thymeleaf tags:** th:text, th:action, th:object, th:field, th:if, th:errors, th:each, th:value, th:href

This demo project goal is just didactic, so I encourage you to read the code, read all the comments, and learn from it.

## Description

This demo includes four controllers

* ThymeleafDemoCustomerController
* ThymeleafDemoDateAndTimeController
* ThymeleafDemoEmployeeController
* ThymeleafDemoHelloController

## Installation

1. The project is based on spring boot <i>v3.4.1</i>, so make sure you have installed at least the required *jdk17*:
```
ilizin@ilizin:~$ java -version
openjdk version "17.0.2" 2022-01-18
OpenJDK Runtime Environment (build 17.0.2+8-86)
OpenJDK 64-Bit Server VM (build 17.0.2+8-86, mixed mode, sharing)
ilizin@ilizin:~$ 
```

2. Make sure you've installed the apache maven, or refer to the official page [Install Maven](https://maven.apache.org/install.html)
to install it.
```
ilizin@ilizin /c
$ mvn -v
Apache Maven 3.9.10 (5f519b97e944483d878815739f519b2eade0a91d)
Maven home: C:\apache-maven-3.9.10
Java version: 17.0.2, vendor: Oracle Corporation, runtime: C:\java\jdk-17.0.2
Default locale: es_ES, platform encoding: Cp1252
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
ilizin@ilizin /c
```

3. Clone the repository:
```
git clone git@github.com:ilizin/thymeleaf-demo.git
```

4. Run the <i>mvn clean install</i> command to run the tests and install the project:
```
ilizin@ilizin:~/repos/thymeleaf-demo (main)
$ mvn clean install
[INFO] Scanning for projects...
[INFO]
[INFO] --------< me.ilizin.spring-demo.springboot-demo:thymeleaf-demo >--------
[INFO] Building thymeleaf-demo 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
...
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- jar:3.4.2:jar (default-jar) @ thymeleaf-demo ---
[INFO] Building jar: C:\ilio\repos\thymeleaf-demo\target\thymeleaf-demo-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot:3.4.1:repackage (repackage) @ thymeleaf-demo ---
[INFO] Replacing main artifact C:\ilio\repos\thymeleaf-demo\target\thymeleaf-demo-0.0.1-SNAPSHOT.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
[INFO] The original artifact has been renamed to C:\ilio\repos\thymeleaf-demo\target\thymeleaf-demo-0.0.1-SNAPSHOT.jar.original
[INFO]
[INFO] --- install:3.1.3:install (default-install) @ thymeleaf-demo ---
[INFO] Installing C:\ilio\repos\thymeleaf-demo\pom.xml to C:\Users\ilio.zincone\.m2\repository\me\ilizin\spring-demo\springboot-demo\thymeleaf-demo\0.0.1-SNAPSHOT\thymeleaf-demo-0.0.1-SNAPSHOT.pom
[INFO] Installing C:\ilio\repos\thymeleaf-demo\target\thymeleaf-demo-0.0.1-SNAPSHOT.jar to C:\Users\ilio.zincone\.m2\repository\me\ilizin\spring-demo\springboot-demo\thymeleaf-demo\0.0.1-SNAPSHOT\thymeleaf-demo-0.0.1-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  36.792 s
[INFO] Finished at: 2025-09-11T19:45:03+02:00
[INFO] ------------------------------------------------------------------------
```

## Usage

1. Have the project installed on your machine, see [Installation](#installation)
2. Run the <i>mvn spring-boot:run</i> command to start it.
3. Validate the console shows a message indicating the project is up and running:
```
ilizin@ilizin:~/repos/thymeleaf-demo$ mvn spring-boot:run
[INFO] Scanning for projects...
....
2025-09-11T19:49:24.225+02:00  INFO 26024 --- [thymeleaf-demo] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2025-09-11T19:49:24.234+02:00  INFO 26024 --- [thymeleaf-demo] [           main] m.i.s.s.t.ThymeleafDemoApplication       : Started ThymeleafDemoApplication in 1.903 seconds (process running for 2.216)
```
4. Access the application from the following four links:

* http://localhost:8080/showForm
* http://localhost:8080/showEmployeeForm
* http://localhost:8080/serverDateAndTime
* http://localhost:8080/showCustomerForm

## Structure

It's a maven based project, therefore the structure is standard, more details about the maven project director layout  [here](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)

## Contributing

Contributions are welcome! If you have an alternative solution or an improvement to an existing solution, feel free to contribute. Follow these steps:

1. Fork the repository.
2. Create a new branch (git checkout -b feature-new-solution).
3. Commit your changes (git commit -m 'Add new solution for problem X').
4. Push to the branch (git push origin feature-new-solution).
5. Open a pull request.

## Contact

GitHub: [ilizin](https://github.com/ilizin)
  