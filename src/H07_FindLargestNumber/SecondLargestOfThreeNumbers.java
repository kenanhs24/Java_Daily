package H07_FindLargestNumber;

import java.util.Scanner;

public class SecondLargestOfThreeNumbers
{
    public static void main(String[] args)
    {
        int x, y, z;

        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        int secondLargest;

        // Determine the second largest number
        if ((x > y && x < z) || (x > z && x < y))
        {
            secondLargest = x;
        } else if ((y > x && y < z) || (y > z && y < x))
        {
            secondLargest = y;
        } else {
            secondLargest = z;
        }

        System.out.println("The second largest number is: " + secondLargest);

        // Close the scanner
        sc.close();
    }
}
