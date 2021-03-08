# ContactsApp

ContactsApp is a simple Java Application I've designed to demonstrate Class Inheritance and Scope.

## Usage

ContactsApp can be run either from an its source code or via its Jar executable.

```bash
cd your_downloads_directory
ContactsApp-1.2-RELEASE.jar
```
Ensure that you have java.exe set up as path default rather than javaw.exe

## Examples of Modular Code
The Contacts class is built to handle a specific data model, in the form of a
full name, phone number and unique identifier. Creating a custom class for this
application was much easier than implementing similar features with a data structure 
in main.java. 

![Class Definition](https://i.imgur.com/WBHal6c.png)

![Validation, Getters & Setters](https://i.imgur.com/mywpvjh.png)

[Contact Class](/src/main/java/Contact.java)
## Examples of Class Inheritance
Both Name fields, as well as the Phone Number field, have a custom exception which is
used to programmatically distinguish faults in code, allowing for a much more reactive and 
flexible platform.

![First Name Exception](https://i.imgur.com/MsKilGI.png)
[FirstNameException](/src/main/java/FirstNameException.java)

## Examples of Variable Scope
Both Private and Public variables are used within this project, and I have attempted to 
maintain both security and efficiency by adopting the "private-bias" model. This ensures that
the program is properly compartmentalised within the JVM.

![Private Class Instances](https://i.imgur.com/UXlojf3.png)
[Main Class](/src/main/java/Main.java)

## Unit Tests
Each stage of validation was subject to a set of differing unit tests, implemented with jUnit 5, 
to ensure that they function as desired. In total, there are eleven unit tests.

![Successful Unit Tests](https://i.imgur.com/XxkKtOn.png)

![Unit Tests](https://i.imgur.com/97EVxpL.png)

[Unit Tests](/src/test/java/ContactTest.java)