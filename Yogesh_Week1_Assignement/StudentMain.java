import java.util.ArrayList;
import java.util.Scanner;

// Student class to hold student data
class Student {
    private String name;
    private int id;

    // Constructor to initialize student
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Override toString method for easy display
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

// Class to manage the student list
class StudentManager {
    private ArrayList<Student> studentList;

    // Constructor to initialize the ArrayList
    public StudentManager() {
        studentList = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(String name, int id) {
        Student student = new Student(name, id);
        studentList.add(student);
        System.out.println("Student added: " + student);
    }

    // Method to remove a student by ID
    public void removeStudent(int id) {
        boolean found = false;
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                System.out.println("Student removed: " + student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Method to display all students
    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of Students:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }
}

// Main class to test the StudentManager
public class StudentMain {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Adding a student
                    System.out.print("Enter student name: ");
                    scanner.nextLine();  // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    manager.addStudent(name, id);
                    break;

                case 2:
                    // Removing a student
                    System.out.print("Enter student ID to remove: ");
                    int removeId = scanner.nextInt();
                    manager.removeStudent(removeId);
                    break;

                case 3:
                    // Displaying all students
                    manager.displayStudents();
                    break;

                case 4:
                    // Exiting the program
                    exit = true;
                    System.out.println("Exiting Student Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

        scanner.close();
    }
}

