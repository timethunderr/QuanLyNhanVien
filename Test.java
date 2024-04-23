import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Create an ArrayList to store employees
        ArrayList<Employee> employees = new ArrayList<>();

        // Initialize 10 employees
        initializeEmployees(employees);

        // Display list of employees
        displayEmployees(employees);

        // Function to add a new employee
        addEmployee(employees);

        // Display list of employees after adding
        displayEmployees(employees);

        // Function to remove an employee
        removeEmployee(employees);

        // Display list of employees after removing
        displayEmployees(employees);
    }

    // Function to initialize 10 employees
    public static void initializeEmployees(ArrayList<Employee> employees) {
        employees.add(new Employee(1, "nguyen van a", 00, "Coca", "C00", 1000));
        employees.add(new Employee(2, "nguyen van b", 11, "Cola", "C01", 2000));
        employees.add(new Employee(3, "nguyen van c", 22, "Pepsi", "C02", 3000));
        employees.add(new Employee(4, "nguyen van d", 33, "Fanta", "C03", 4000));
        employees.add(new Employee(5, "nguyen van e", 44, "Sprite", "C04", 5000));
        employees.add(new Employee(6, "nguyen van f", 55, "7up", "C05", 6000));
        employees.add(new Employee(7, "nguyen van g", 66, "Sting", "C06", 7000));
        employees.add(new Employee(8, "nguyen van h", 77, "Stung", "C07", 8000));
        employees.add(new Employee(9, "nguyen van i", 88, "Lavie", "C08", 9000));
        employees.add(new Employee(10, "nguyen van j", 99, "Laviem", "C09", 10000));
    }

    // Function to display list of employees
    public static void displayEmployees(ArrayList<Employee> employees) {
        System.out.println("List of Employees:");
        for (Employee employee : employees) {
            employee.display();
        }
    }

    // Function to add a new employee
    public static void addEmployee(ArrayList<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details of the new employee:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        employees.add(new Employee(id, name, age, department, code, salary));
    }

    // Function to remove an employee
    public static void removeEmployee(ArrayList<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID of the employee to remove:");
        int id = scanner.nextInt();
        boolean removed = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Employee with ID " + id + " has been removed.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }
}
