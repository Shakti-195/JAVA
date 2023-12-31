public class Employee {
    // Instance variables
    private int empId;
    private String empName;
    private String empAddress;
    private double empSalary;

    // Default constructor
    public Employee() {
        // Default constructor
    }

    // Constructor with all parameters
    public Employee(int empId, String empName, String empAddress, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
    }

    // Getter and setter methods for empId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter and setter methods for empName
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter and setter methods for empAddress
    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    // Getter and setter methods for empSalary
    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    public static void main(String[] args) {
        // Creating an object with all parameters
        Employee emp = new Employee(103, "Jane Doe", "123 Main St", 50000.0);

        // Using getter methods to access instance variables
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee Address: " + emp.getEmpAddress());
        System.out.println("Employee Salary: " + emp.getEmpSalary());

        // Using toString method to print object details
        System.out.println(emp);
    }
}

Output:

Employee ID: 103
Employee Name: Jane Doe
Employee Address: 123 Main St
Employee Salary: 50000.0
Employee{empId=103, empName='Jane Doe', empAddress='123 Main St', empSalary=50000.0}
