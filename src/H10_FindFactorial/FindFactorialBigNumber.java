package H10_FindFactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class FindFactorialBigNumber
{
    public static void main(String[] args) {

        // Initialize variables
        BigInteger factorial = BigInteger.ONE;  // Start with 1
        Scanner sc = new Scanner(System.in);

        //  user for input
        System.out.println("Enter a non-negative integer: ");
        int n = sc.nextInt();

        // Validate input
        if (n < 0) {
            System.out.println("Invalid input! The number should be a non-negative integer.");
        } else {
            // Compute factorial
            for (int i = 1; i <= n; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

            // Display result
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        // Close scanner
        sc.close();
    }
}
