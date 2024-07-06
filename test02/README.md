# Library Management System

## Overview

This project is a mini-library management system implemented in Java, demonstrating key Object-Oriented Programming (OOP) concepts such as classes, objects, inheritance, polymorphism, encapsulation, and abstraction. The system manages books, members, and library operations such as issuing and returning books.

## Class Design

### Book
- *Attributes*: bookID (int), title (String), author (String), isIssued (boolean)
- *Methods*: Getters and setters for each attribute

### Member
- *Attributes*: memberID (int), name (String), maxBooksIssued (int), currentIssuedBooks (List<Book>)
- *Methods*: Getters, setters, and methods to add and remove books from currentIssuedBooks

### Library (extends Member)
- *Methods*: Methods to add and remove books from the library

### StudentMember (extends Member)
- *Attributes*: Inherits attributes from Member with maxBooksIssued set to 3

### TeacherMember (extends Member)
- *Attributes*: Inherits attributes from Member with maxBooksIssued set to 5

### LibraryOperations (interface)
- *Methods*: boolean issueBook(Book book, Member member), boolean returnBook(Book book, Member member)

### Library
- *Attributes*: books (List<Book>), members (List<Member>)
- *Methods*: Implements LibraryOperations interface methods

## How to Compile and Run

1. Compile the Java files:
   
    javac *.java
    

2. Run the main class:
    
    java Main
    
    ##sample output
    
   -Student One issued java programming 
   Teacher one issued python programming
   student one issued java programming
   C++ programming removed from the librarian by john doe
   
   ## Functionalities Demonstrated

- *Adding Books*: The librarian adds books to the library.
- *Issuing Books*: Books are issued to members (students and teachers) based on their respective limits.
- *Returning Books*: Issued books are returned by the members.
- *Removing Books*: The librarian removes books from the library.
- *Error Handling*: Proper handling of scenarios where book issuing or returning fails.

## OOP Concepts Used

- *Encapsulation*: All class attributes are private, with public getter and setter methods.
- *Inheritance*: Specialized types of Member (StudentMember, TeacherMember, and Librarian) are created using inheritance.
- *Polymorphism*: Overridden methods in subclasses to exhibit different behaviors.
- *Abstraction*: Defined an interface LibraryOperations to abstract the library operations.

## Notes

- Ensure that all .java files are in the same directory before compiling and running the program.
- The provided sample output demonstrates a successful run of the library management system, including successful and unsuccessful book issues and returns, and addition and removal of books by the librarian.
    
