package H06_Swap2Numbers;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Declare variables
        int a, b, temp;

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

        // Swap the numbers using a temporary variable
        temp = a;
        a = b;
        b = temp;

        // Display numbers after swapping
        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Close Scanner
        sc.close();
    }
}
