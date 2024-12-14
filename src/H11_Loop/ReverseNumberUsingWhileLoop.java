package H11_Loop;

import java.util.Scanner;

public class ReverseNumberUsingWhileLoop {
    public static void main(String[] args) {
        int number, reverseNumber = 0;

        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        while (number != 0) {
            reverseNumber = reverseNumber * 10 + number % 10; // Get the last digit and add it to reverseNumber
            number = number / 10; // Remove the last digit from the number
        }

        System.out.println("Reversed Number: " + reverseNumber);
    }
}
