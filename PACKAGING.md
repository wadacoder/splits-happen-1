# Steps to compile, package and execute the splits-happen-1 solution

## Prerequisites to package and execute
* Java is installed
* Maven is installed
* Internet connection to resolve maven dependencies 

## Download
* `git clone <your repo url>`
* Eg: `https://github.com/<your profile>/splits-happen-1.git` ; enter credentials as prompted

## Compile, test and package
* Navigate to the folder where the `pom.xml` of the cloned repo is located
* To execute a clean test and packaging of the solution, run `mvn clean package`
* This will create `splits-happen-1-1.0.1.jar` under the `target` folder

## Execute
* Navigate on CLI to `target` folder containing the jar
* Execute `java -jar splits-happen-1-1.0.1.jar` or `java -jar splits-happen-1-1.0.1.jar -help` to read program execution hints
* Sample execution `java -jar splits-happen-1-1.0.1.jar XXXXXXXXXXXX`
