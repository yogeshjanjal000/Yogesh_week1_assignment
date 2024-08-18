 import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Employee class to hold employee data
class Employee {
    private int id;
    private String name;
    private String department;

    // Constructor to initialize employee details
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Override toString method for easy display
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

// Class to manage employees using a HashMap
class EmployeeManager {
    private HashMap<Integer, Employee> employeeMap;

    // Constructor to initialize the HashMap
    public EmployeeManager() {
        employeeMap = new HashMap<>();
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        System.out.println("Employee added: " + employee);
    }

    // Method to retrieve an employee by ID
    public Employee getEmployee(int id) {
        return employeeMap.get(id);
    }

    // Method to display all employees
    public void displayAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("List of Employees:");
            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }
}

// Main class to test the EmployeeManager
public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Retrieve Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Adding an employee
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee department: ");
                    String department = scanner.nextLine();
                    Employee employee = new Employee(id, name, department);
                    manager.addEmployee(employee);
                    break;

                case 2:
                    // Retrieving an employee by ID
                    System.out.print("Enter employee ID to retrieve: ");
                    int retrieveId = scanner.nextInt();
                    Employee retrievedEmployee = manager.getEmployee(retrieveId);
                    if (retrievedEmployee != null) {
                        System.out.println("Employee details: " + retrievedEmployee);
                    } else {
                        System.out.println("Employee with ID " + retrieveId + " not found.");
                    }
                    break;

                case 3:
                    // Displaying all employees
                    manager.displayAllEmployees();
                    break;

                case 4:
                    // Exiting the program
                    exit = true;
                    System.out.println("Exiting Employee Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

        scanner.close();
    }
}
