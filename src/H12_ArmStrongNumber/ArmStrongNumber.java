package H12_ArmStrongNumber;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();  // Input number
        int temp = n;          // Copy of the number for processing
        int arm = 0;           // To store the sum of digits raised to the power
        int digits = 0;        // To count the number of digits

        // Calculate the number of digits
        int tempForDigits = temp;
        while (tempForDigits > 0) {
            tempForDigits /= 10;
            digits++;
        }

        // Calculate the Armstrong sum
        temp = n; // Reset temp to original number
        while (temp > 0) {
            int rem = temp % 10;            // Extract the last digit
            arm += Math.pow(rem, digits);  // Add the digit raised to the power of digits
            temp /= 10;                    // Remove the last digit
        }

        // Check if the number is an Armstrong number
        if (n == arm) {
            System.out.println(n + " is an Armstrong Number.");
        } else {
            System.out.println(n + " is not an Armstrong Number.");
        }
        sc.close();
    }
}
