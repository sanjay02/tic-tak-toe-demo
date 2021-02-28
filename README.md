# tic-tak-toe-demo

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
