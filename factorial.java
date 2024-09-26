import java.util.*;

public class Functions {
    // Method to print the factorial of a given number
    public static void printFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner to take input
        System.out.println("Enter a number:");
        int n = sc.nextInt(); // Take integer input from the user

        printFactorial(n); // Call the function to print factorial

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
