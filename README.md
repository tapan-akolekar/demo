**README**

**Test Cases**

**Maven Commands**

To run the test cases, use the following Maven commands:

* `mvn test`: Runs all the test cases in the project.
* `mvn clean test`: Deletes the target directory, recompiles the project, and runs all the test cases.

**Additional Maven Commands**

* `mvn clean`: Deletes the target directory and removes all compiled classes.
* `mvn compile`: Compiles the Java code in the project.
* `mvn package`: Packages the project into a JAR file.
* `mvn install`: Installs the project into the local Maven repository.

_______________________________________________________________________________________________________________
add `-Djasypt.encryptor.password=<your_password_here>` in VM arguments

use following command to encrypt your values-

`mvn jasypt:encrypt-value -Djasypt.encryptor.password=<your_password_here> -Djasypt.plugin.value=<value_to_encrypt>`
