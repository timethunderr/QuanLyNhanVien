public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private double salary;

    // Constructor
    public Employee(int id, String name, int age, String department, String code, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee information
    public void display() {
    System.out.println("Mã: " + id + ", Tên: " + name + ", Tuổi: " + age + ", Bộ phận: " + department + ", Mã nhân viên: " + code + ", Mức lương: " + salary);
    }
}
