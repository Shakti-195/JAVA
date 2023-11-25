// Define the Sports class
class Sports {
    // Member variable
    String sportName;

    // Constructor
    public Sports(String sportName) {
        this.sportName = sportName;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Sport: " + sportName);
    }
}

// Define the Cricket class, inheriting from Sports
class Cricket extends Sports {
    // Member variable specific to Cricket
    int numberOfPlayers;

    // Constructor
    public Cricket(String sportName, int numberOfPlayers) {
        // Call the constructor of the base class (Sports)
        super(sportName);
        this.numberOfPlayers = numberOfPlayers;
    }

    // Method to display additional information for Cricket
    public void displayCricketInfo() {
        System.out.println("Number of Players: " + numberOfPlayers);
    }
}

// Main class to test the inheritance
public class Main {
    public static void main(String[] args) {
        // Create an instance of Cricket
        Cricket cricket = new Cricket("Cricket", 11);

        // Display information using methods from both base and derived classes
        cricket.displayInfo();
        cricket.displayCricketInfo();
    }
}

Output:
Sport: Cricket
Number of Players: 11
