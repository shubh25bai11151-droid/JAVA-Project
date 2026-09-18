# JAVA-Project

Library Management System
A simple console-based Library Management System developed using Java and Object-Oriented Programming concepts.

About the Project
The Library Management System is designed to manage books and library members through a simple interactive menu.

The system allows users to add, search, issue, return, and remove books, as well as manage library members.

Features
Add new books
Add new library members
Display all books
Search for a book using Book ID
Issue a book
Return a book
Remove a book
Display all members
Display currently issued books
Exit the system
Technologies Used
Java
Object-Oriented Programming (OOP)
ArrayList
Scanner
VS Code
Java Concepts Used
This project demonstrates:

Classes and Objects
Constructors
Encapsulation
Methods
ArrayList
Loops
Conditional Statements
Switch Case
Exception-free input handling
Basic OOP principles
Project Structure
Library-Management-System/

│
├── src/
│   ├── Book.java
│   ├── Member.java
│   ├── Library.java
│   └── Main.java
│
├── screenshots/
│
├── docs/
│
├── README.md
├── .gitignore
└── LICENSE

How to Run
Clone the Repository
git clone <repository-url>
Open the Project
Open the Library-Management-System folder in Visual Studio Code.

Open the Terminal
Navigate to the src folder:

cd src
Compile the Java Files
javac *.java
Run the Program
java Main

How the system works
         START
           ↓
      Display Menu
           ↓
   Select an Operation
           ↓
  Perform the Operation
           ↓
    Display the Result
           ↓
    Return to Menu
           ↓
      Exit System
Main Classes
Book.java

Represents a book in the library.

It stores:

-Book ID

-Book title

-Author name

-Book availability status

Member.java

Represents a library member.

It stores:

-Member ID

-Member name

Library.java

Manages the library operations, including:

-Adding books

-Adding members

-Searching books

-Issuing books

-Returning books

-Removing books

-Displaying books and members

Main.java

Contains the main() method and provides the interactive menu through which the user operates the system.

Future Improvements
Possible future improvements include:

Graphical User Interface (GUI)

Database integration

Login and authentication

Due date and fine calculation

Book categories

Member-wise borrowing history

Author
Shubh Singh

B.Tech CSE (AIML)

VIT Bhopal University

This project was created as a Java learning project to practice Object-Oriented Programming and basic software development concepts.
