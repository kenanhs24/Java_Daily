package H07_FindLargestNumber;

import java.util.Scanner;

public class LargestOfThreeNumbers
{
    public static void main(String[] args)
    {
        int x, y, z;

        System.out.println("Enter three distinct numbers (e.g., 5 10 15): ");
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        // Find the largest number
        if (x >= y && x >= z)
        {
            System.out.println("The largest number is: " + x);
        }
        else if (y >= x && y >= z)
        {
            System.out.println("The largest number is: " + y);
        }
        else
        {
            System.out.println("The largest number is: " + z);
        }

        // Close the scanner
        sc.close();
    }
}
