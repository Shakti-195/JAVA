public class Employee {
    private int EMPID;
    private String EMPName;
    private String EMPAddress;
    private double EMPSale;

    // Default constructor
    public Employee() {
    }

    // Constructor with one parameter (EMPID)
    public Employee(int EMPID) {
        this.EMPID = EMPID;
    }

    // Constructor with two parameters (EMPID and EMPName)
    public Employee(int EMPID, String EMPName) {
        this.EMPID = EMPID;
        this.EMPName = EMPName;
    }

    // Constructor with all parameters
    public Employee(int EMPID, String EMPName, String EMPAddress, double EMPSale) {
        this.EMPID = EMPID;
        this.EMPName = EMPName;
        this.EMPAddress = EMPAddress;
        this.EMPSale = EMPSale;
    }

    // DisplayDetails method
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("EMPID: " + EMPID);
        System.out.println("EMPName: " + EMPName);
        System.out.println("EMPAddress: " + EMPAddress);
        System.out.println("EMPSale: " + EMPSale);
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating an instance with the default constructor
        Employee employee1 = new Employee();

        // Creating an instance with the constructor with one parameter
        Employee employee2 = new Employee(101);

        // Creating an instance with the constructor with two parameters
        Employee employee3 = new Employee(102, "John Doe");

        // Creating an instance with the constructor for all parameters
        Employee employee4 = new Employee(103, "Jane Smith", "123 Main St", 50000.0);

        // Displaying details for each employee
        employee1.displayDetails();
        employee2.displayDetails();
        employee3.displayDetails();
        employee4.displayDetails();
    }
}

Output:

Employee Details:
EMPID: 0
EMPName: null
EMPAddress: null
EMPSale: 0.0
Employee Details:
EMPID: 101
EMPName: null
EMPAddress: null
EMPSale: 0.0
Employee Details:
EMPID: 102
EMPName: John Doe
EMPAddress: null
EMPSale: 0.0
Employee Details:
EMPID: 103
EMPName: Jane Smith
EMPAddress: 123 Main St
EMPSale: 50000.0
