package H09_OddandEvenNumber;

import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        int number;
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");

        // Read integer input
        number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // Close scanner to release resources
        scanner.close();
    }
}
