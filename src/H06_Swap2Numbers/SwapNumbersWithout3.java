package H06_Swap2Numbers;

import java.util.Scanner;

public class SwapNumbersWithout3
{

        public static void main(String[] args)
        {
            // Declare two variables
            int a, b;

            // Initialize Scanner
            Scanner sc = new Scanner(System.in);

            // Prompt the user for input
            System.out.println("Enter two numbers (a and b):");
            a = sc.nextInt();
            b = sc.nextInt();

            // Display numbers before swapping
            System.out.println("Before Swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            // Swap without using a third variable
            a = a + b; // Step 1: Add a and b
            b = a - b; // Step 2: Subtract b from the sum to get the original value of a
            a = a - b; // Step 3: Subtract the new value of b from the sum to get the original value of b

            // Display numbers after swapping
            System.out.println("After Swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            // Close Scanner
            sc.close();
        }
    }


