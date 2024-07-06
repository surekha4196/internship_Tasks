package com.test02;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian = new Librarian(1, "John Doe");

        Book book1 = new Book(101, "Java Programming", "Author A");
        Book book2 = new Book(102, "Python Programming", "Author B");
        Book book3 = new Book(103, "C++ Programming", "Author C");

        librarian.addBook(library, book1);
        librarian.addBook(library, book2);
        librarian.addBook(library, book3);

        StudentMember student = new StudentMember(2, "Student One");
        TeacherMember teacher = new TeacherMember(3, "Teacher One");

        library.getMembers().add(librarian);
        library.getMembers().add(student);
        library.getMembers().add(teacher);

        // Issue book to student
        if (library.issueBook(book1, student)) {
            System.out.println(student.getName() + " issued " + book1.getTitle());
        } else {
            System.out.println("Failed to issue " + book1.getTitle() + " to " + student.getName());
        }

        // Issue book to teacher
        if (library.issueBook(book2, teacher)) {
            System.out.println(teacher.getName() + " issued " + book2.getTitle());
        } else {
            System.out.println("Failed to issue " + book2.getTitle() + " to " + teacher.getName());
        }

        // Return book from student
        if (library.returnBook(book1, student)) {
            System.out.println(student.getName() + " returned " + book1.getTitle());
        } else {
            System.out.println("Failed to return " + book1.getTitle() + " by " + student.getName());
        }

        // Remove book by librarian
        librarian.removeBook(library, book3);
        System.out.println(book3.getTitle() + " removed from the library by " + librarian.getName());
    }
}