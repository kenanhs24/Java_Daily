package H04_InputScanner;

import java.util.Scanner;

public class GetInputScanner
{
    public static void main(String[] args)
    {
        int a;
        float b;
        String c;

        Scanner input = new Scanner(System.in);

        // Read a string
        System.out.println("Enter a String:");
        c = input.nextLine(); // Read the full line of text
        System.out.println("You entered string = " + c);

        // Read a float
        while (true)
        {
            try
            {
                System.out.println("Enter a Float:");
                b = input.nextFloat(); // Read a float value
                System.out.println("You entered float = " + b);
                input.nextLine(); // Clear the buffer
                break;
            }
            catch (Exception e)
            {
                System.out.println("Invalid input. Please enter a valid float.");
                input.nextLine(); // Clear invalid input
            }
        }

        // Read an integer
        while (true)
        {
            try
            {
                System.out.println("Enter an Integer:");
                a = input.nextInt(); // Read an integer value
                System.out.println("You entered int = " + a);
                break;
            }
            catch (Exception e)
            {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.nextLine(); // Clear invalid input
            }
        }

        input.close(); // Close the scanner to prevent resource leaks
    }
}
