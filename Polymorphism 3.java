public class Employee {
    // Instance variables
    private int empId;
    private String empName;
    private String empAddress;
    private double empSalary;

    // Default constructor
    public Employee() {
        System.out.println("Default Constructor");
    }

    // Constructor with one parameter (EMP ID)
    public Employee(int empId) {
        this.empId = empId;
        System.out.println("Constructor with EMP ID: " + empId);
    }

    // Constructor with two parameters (EMP ID and EMP Name)
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        System.out.println("Constructor with EMP ID: " + empId + " and EMP Name: " + empName);
    }

    // Other methods and getters/setters can be added as needed

    public static void main(String[] args) {
        // Creating objects using different constructors
        Employee emp1 = new Employee();                 // Default constructor
        Employee emp2 = new Employee(101);              // Constructor with EMP ID
        Employee emp3 = new Employee(102, "John Doe");  // Constructor with EMP ID and EMP Name
    }
}

Output :

Default Constructor
Constructor with EMP ID: 101
Constructor with EMP ID: 102 and EMP Name: John Doe
