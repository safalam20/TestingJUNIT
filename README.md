### JUnit
JUnit is an open source Unit Testing Framework for JAVA.

### Unit Testing

- Unit testing involves breaking your program into pieces, and subjecting each piece to a series of tests.
- Usually tests are run as separate programs, but the method of testing varies, depending on the language, and type of software (GUI, command-line, library).
- Tests are usually run periodically, often after every change to the source code. The more often the better, because the sooner you will catch problems.

### JUnit in IntelliJ Idea

The libraries for JUnit and are shipped with IntelliJ IDEA, but are not included in the classpath of your project or module by default. Consequently, when a test class is created, the references to the TestCase class or test annotations are not resolved.
To add a test library when creating a test for a class
 - In the editor, place the caret within the line containing the class declaration.
 - Press Alt+Enter and select 'Create Test' and when library is not found click 'Fix'. 
