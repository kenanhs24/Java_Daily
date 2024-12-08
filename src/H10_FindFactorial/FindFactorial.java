package H10_FindFactorial;

import java.util.Scanner;

public class FindFactorial
{
    public static void main(String[] args) {
        int n, fact = 1;  // Initialize variables
        Scanner sc = new Scanner(System.in);

        //  user for input
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        // Check for invalid input
        if (n < 0) {
            System.out.println("Invalid input!!! The number should be a non-negative integer.");
        } else {
            // Calculate factorial
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            // Display the result
            System.out.println("The factorial of " + n + " is: " + fact);
        }

        // Close the scanner
        sc.close();
    }
}
