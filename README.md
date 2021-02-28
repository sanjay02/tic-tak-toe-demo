# tic-tak-toe-demo

#################### How to Play the Game  #########################

Both the players choose either X or O to mark their cells.
There will be a 3×3 grid with numbers assigned to each of the 9 cells.
The player who chose X begins to play first.
He enters the cell number where he wishes to place X.
Now, both O and X play alternatively until any one of the two wins.
Winning criteria: Whenever any of the two players has fully filled one row/ column/ diagonal with his symbol (X/ O), he wins and the game ends.
If neither of the two players wins, the game is said to have ended in a draw.

#################### Create Repository in GIT and pushing the code in Git #########################

sanjay@DESKTOP-QFMS3FU MINGW64 /c/WS/IBMDEMO/tic-tak-toe-demo (main)

$ git clone https://github.com/sanjay02/tic-tak-toe-demo.gits

$ git status
On branch main
Your branch is up to date with 'origin/main'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .classpath
        .project
        .settings/
        .springBeans
        dockerfile
        pom.xml
        src/
        target/

nothing added to commit but untracked files present (use "git add" to track)

sanjay@DESKTOP-QFMS3FU MINGW64 /c/WS/IBMDEMO/tic-tak-toe-demo (main)
$ git add .
warning: LF will be replaced by CRLF in target/maven-status/maven-compiler-plugin/compile/default-compile/createdFiles.lst.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in target/maven-status/maven-compiler-plugin/compile/default-compile/inputFiles.lst.
The file will have its original line endings in your working directory

sanjay@DESKTOP-QFMS3FU MINGW64 /c/WS/IBMDEMO/tic-tak-toe-demo (main)
$ git commit -m "Ibm demo"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'sanjay@DESKTOP-QFMS3FU.(none)')

sanjay@DESKTOP-QFMS3FU MINGW64 /c/WS/IBMDEMO/tic-tak-toe-demo (main)
$ git config user.name "sanjay02"

sanjay@DESKTOP-QFMS3FU MINGW64 /c/WS/IBMDEMO/tic-tak-toe-demo (main)
$ git config user.email "sanjay.pd.shaw@gmail.com"

sanjay@DESKTOP-QFMS3FU MINGW64 /c/WS/IBMDEMO/tic-tak-toe-demo (main)
$ git commit -m "IBM Demo Done"
[main ef51f86] IBM Demo Done
 29 files changed, 459 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 .settings/.jsdtscope
 create mode 100644 .settings/org.eclipse.core.resources.prefs
 create mode 100644 .settings/org.eclipse.jdt.core.prefs
 create mode 100644 .settings/org.eclipse.m2e.core.prefs
 create mode 100644 .settings/org.eclipse.wst.common.component
 create mode 100644 .settings/org.eclipse.wst.common.project.facet.core.xml
 create mode 100644 .settings/org.eclipse.wst.jsdt.ui.superType.container
 create mode 100644 .settings/org.eclipse.wst.jsdt.ui.superType.name
 create mode 100644 .settings/org.eclipse.wst.validation.prefs
 create mode 100644 .settings/org.springframework.ide.eclipse.prefs
 create mode 100644 .springBeans
 create mode 100644 dockerfile
 create mode 100644 pom.xml
 create mode 100644 src/main/java/san/ibm/demo/SpringBootHelloWorldApplication.java
 create mode 100644 src/main/java/san/ibm/demo/constants/AppConstants.java
 create mode 100644 src/main/java/san/ibm/demo/service/TicTakToeRequestService.java
 create mode 100644 src/main/resources/application.properties
 create mode 100644 src/test/java/san/ibm/demo/service/TicTakToeRequestServiceTest.java
 create mode 100644 target/classes/application.properties
 create mode 100644 target/classes/san/ibm/demo/SpringBootHelloWorldApplication.class
 create mode 100644 target/classes/san/ibm/demo/constants/AppConstants.class
 create mode 100644 target/classes/san/ibm/demo/service/TicTakToeRequestService.class
 create mode 100644 target/maven-archiver/pom.properties
 create mode 100644 target/maven-status/maven-compiler-plugin/compile/default-compile/createdFiles.lst
 create mode 100644 target/maven-status/maven-compiler-plugin/compile/default-compile/inputFiles.lst
 create mode 100644 target/tic-tak-doe-demo-0.0.1-SNAPSHOT.jar
 create mode 100644 target/tic-tak-doe-demo-0.0.1-SNAPSHOT.jar.original

sanjay@DESKTOP-QFMS3FU MINGW64 /c/WS/IBMDEMO/tic-tak-toe-demo (main)
$ git push origin main
Enumerating objects: 59, done.
Counting objects: 100% (59/59), done.
Delta compression using up to 4 threads
Compressing objects: 100% (38/38), done.
Writing objects: 100% (58/58), 12.08 MiB | 2.02 MiB/s, done.
Total 58 (delta 3), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (3/3), done.
To https://github.com/sanjay02/tic-tak-toe-demo.git
   5071d81..ef51f86  main -> main

sanjay@DESKTOP-QFMS3FU MINGW64 /c/WS/IBMDEMO/tic-tak-toe-demo (main)


====================================================================================
###################################################################################
Create Amazon Instances,Create Docker Image, Run Image,docker Container,
Run Container, Execute images
##################################################################################
====================================================================================

sanjay@DESKTOP-QFMS3FU MINGW64 /e/ASW_KEY
$ ssh -i "sanjayaws.pem" ec2-user@ec2-3-22-170-165.us-east-2.compute.amazonaws.com
load pubkey "sanjayaws.pem": invalid format
Last login: Sun Feb 28 07:37:33 2021 from 49.207.193.133

       __|  __|_  )
       _|  (     /   Amazon Linux 2 AMI
      ___|\___|___|

https://aws.amazon.com/amazon-linux-2/
62 package(s) needed for security, out of 104 available
Run "sudo yum update" to apply all updates.
[ec2-user@ip-172-31-43-77 ~]$ sudo -i
[root@ip-172-31-43-77 ~]# docker ps
CONTAINER ID        IMAGE               COMMAND             CREATED             STATUS              PORTS               NA
MES

[root@ip-172-31-43-77 ~]# git clone https://github.com/sanjay02/tic-tak-toe-demo.git
Cloning into 'tic-tak-toe-demo'...
remote: Enumerating objects: 61, done.
remote: Counting objects: 100% (61/61), done.
remote: Compressing objects: 100% (36/36), done.
remote: Total 61 (delta 3), reused 58 (delta 3), pack-reused 0
Unpacking objects: 100% (61/61), done.
[root@ip-172-31-43-77 ~]# 

[root@ip-172-31-43-77 ~]# ls
discovery-microservice-server  dockeimagedemo  employee-producer  PhotoAppApiUsers1  PhotoAppDiscoveryService1  tic-tak-toe-demo
[root@ip-172-31-43-77 ~]# cd tic-tak-toe-demo
[root@ip-172-31-43-77 tic-tak-toe-demo]# sudo docker build -t tictaktoi:1.0 .
Sending build context to Docker daemon  39.89MB
Step 1/5 : FROM openjdk:8-jdk-alpine
 ---> a3562aa0b991
Step 2/5 : ARG JAR_FILE=target/tic-tak-doe-demo-0.0.1-SNAPSHOT.jar
 ---> Using cache
 ---> 34b3be3da6f4
Step 3/5 : WORKDIR /opt/app
 ---> Using cache
 ---> daf6b55e38e2
Step 4/5 : COPY ${JAR_FILE} app.jar
 ---> Using cache
 ---> c43ef170ae16
Step 5/5 : ENTRYPOINT ["java","-jar","app.jar"]
 ---> Using cache
 ---> 2f1c9b7bc810
Successfully built 2f1c9b7bc810
Successfully tagged tictaktoi:1.0
[root@ip-172-31-43-77 tic-tak-toe-demo]#
[root@ip-172-31-43-77 tic-tak-toe-demo]# docker images
REPOSITORY          TAG                 IMAGE ID            CREATED             SIZE
spring-boot         1.0                 2f1c9b7bc810        About an hour ago   119MB
tictaktoi           1.0                 2f1c9b7bc810        About an hour ago   119MB

[root@ip-172-31-43-77 tic-tak-toe-demo]# docker run -it 2f1c9b7bc810

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.4.1.RELEASE)

2021-02-28 08:17:45.696  INFO 1 --- [           main] s.i.d.SpringBootHelloWorldApplication    : Starting SpringBootHelloWorldApplication v0.0.1-SNAPSHOT on 5fe1a05ace3c with PID 1 (/opt/app/app.jar started by root in /opt/app)
2021-02-28 08:17:45.718  INFO 1 --- [           main] s.i.d.SpringBootHelloWorldApplication    : No active profile set, falling back to default profiles: default
2021-02-28 08:17:45.917  INFO 1 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@14514713: startup date [Sun Feb 28 08:17:45 GMT 2021]; root of context hierarchy
2021-02-28 08:17:49.374  INFO 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8888 (http)
2021-02-28 08:17:49.413  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service Tomcat
2021-02-28 08:17:49.419  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.5
2021-02-28 08:17:49.626  INFO 1 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2021-02-28 08:17:49.626  INFO 1 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 3726 ms
2021-02-28 08:17:49.965  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
2021-02-28 08:17:49.976  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2021-02-28 08:17:49.980  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2021-02-28 08:17:49.981  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2021-02-28 08:17:49.982  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2021-02-28 08:17:50.658  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@14514713: startup date [Sun Feb 28 08:17:45 GMT 2021]; root of context hierarchy
2021-02-28 08:17:50.840  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2021-02-28 08:17:50.846  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2021-02-28 08:17:50.997  INFO 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2021-02-28 08:17:51.000  INFO 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2021-02-28 08:17:51.086  INFO 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2021-02-28 08:17:51.387  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2021-02-28 08:17:51.512  INFO 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8888 (http)
2021-02-28 08:17:51.523  INFO 1 --- [           main] s.i.d.SpringBootHelloWorldApplication    : Started SpringBootHelloWorldApplication in 7.065 seconds (JVM running for 8.019)
2021-02-28 08:17:51.523  INFO 1 --- [           main] s.i.d.service.TicTakToeRequestService    : Start the process() from TicTakToeRequestService
Welcome to 3x3 Tic Tac Toe.
|---|---|---|
| 1 | 2 | 3 |
|-----------|
| 4 | 5 | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
Board Created.The game will start with player X:
2
|---|---|---|
| 1 | X | 3 |
|-----------|
| 4 | 5 | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
O's TURN; enter a slot number to place O in:
4
|---|---|---|
| 1 | X | 3 |
|-----------|
| O | 5 | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
X's TURN; enter a slot number to place X in:
5
|---|---|---|
| 1 | X | 3 |
|-----------|
| O | X | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
O's TURN; enter a slot number to place O in:
7
|---|---|---|
| 1 | X | 3 |
|-----------|
| O | X | 6 |
|-----------|
| O | 8 | 9 |
|---|---|---|
X's TURN; enter a slot number to place X in:
8
|---|---|---|
| 1 | X | 3 |
|-----------|
| O | X | 6 |
|-----------|
| O | X | 9 |
|---|---|---|
PLAYER  X WON!
