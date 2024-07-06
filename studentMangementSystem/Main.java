package studentMangementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        String filename = "students.dat";
        manager.loadFromFile(filename);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Remove a student by ID");
            System.out.println("3. Update student details by ID");
            System.out.println("4. Search for a student by ID");
            System.out.println("5. Display all students");
            System.out.println("6. Exit and save data");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    manager.addStudent(new Student(id, name, age, grade, address));
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    manager.removeStudent(id);
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter new name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    age = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter new grade: ");
                    grade = scanner.nextLine();
                    System.out.print("Enter new address: ");
                    address = scanner.nextLine();
                    manager.updateStudent(id, name, age, grade, address);
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    Student student = manager.searchStudent(id);
                    if (student != null) {
                        System.out.println(student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    manager.displayAllStudents();
                    break;
                case 6:
                    manager.saveToFile(filename);
                    System.out.println("Data saved. Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
