# Design-and-Implementation-of-a-Core-Math-Library-Using-OOP-Principles

The IDE is used while creating a Java application project with a primary class.
automatically duplicates every JAR
files from the projects classpath to the dist/lib subdirectory of your projects. The IDE
also adds each JAR file to the application's Class-Path element.
Manifest file (MANIFEST.MF) for JAR files.
To run the project from the command line, go to the dist folder and
type the following:


java -jar "OOPCJ.jar"
Zip up the dist folder (which includes the lib folder) in order to distribute this project.
then make the ZIP file available.

If the names of two JAR files in the project classpath are identical, only the first
The lib folder has a copy of the JAR file.
* The lib folder only contains JAR files.
If there are other kinds of files or directories in the classpath, these files (folders)
are not duplicated.
* If a class-path element is also present in a library on the project's classpath
As stated in the manifest, the Class-Path element's content must be on
the runtime path of the project.
* In a typical Java project, right-click the project node to set a primary class.
Select Properties in the Projects pane. Next, select Run and input the
class name in the Main Class field. As an alternative, you can type the
class name in the Main-Class manifest element.
