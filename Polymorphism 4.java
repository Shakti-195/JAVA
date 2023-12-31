public class Employee {
    // Instance variables
    private int empId;
    private String empName;
    private String empAddress;
    private double empSalary;

    // Constructor with all parameters
    public Employee(int empId, String empName, String empAddress, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
    }

    // Method to create and display employee details
    public void createDisplayDetails() {
        System.out.println("Employee Details:");
        System.out.println("EMP ID: " + empId);
        System.out.println("EMP Name: " + empName);
        System.out.println("EMP Address: " + empAddress);
        System.out.println("EMP Salary: " + empSalary);
    }

    public static void main(String[] args) {
        // Creating an object with all parameters
        Employee emp = new Employee(103, "Jane Doe", "123 Main St", 50000.0);

        // Calling createDisplayDetails to display employee details
        emp.createDisplayDetails();
    }
}

Output:

Employee Details:
EMP ID: 103
EMP Name: Jane Doe
EMP Address: 123 Main St
EMP Salary: 50000.0
