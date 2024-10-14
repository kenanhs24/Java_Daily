package day02;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        //way-1

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number = ");

        // Read the number from user input
        int number = scanner.nextInt();
        System.out.println("Your number is  = " + number);

        // Initialize a variable to store the reversed number
        int reverse1 = 0;

        // Loop to reverse the number
        while (number !=0){
            // Add the last digit of 'number' to 'reverse1' after shifting reverse1
            reverse1= reverse1*10+ number%10;
            // Remove the last digit from 'number'
            number=number/10;
        }

        // Output the reversed number
        System.out.println("Reverse 1 number is  = " + reverse1);




        //way -2

        // Use StringBuffer to reverse the number as a string
        StringBuffer reverse2;
        StringBuffer input = new StringBuffer(String.valueOf(reverse1)); // Convert reverse1 to a String
        reverse2 = input.reverse(); // Reverse the string

        // Output the reversed string number
        System.out.println("Reverse 2 number (reverse 1 using StringBuffer) = " + reverse2);



        //way -3
        // Use StringBuilder to reverse the number as a string
        StringBuilder reverse3;
        StringBuilder input3 = new StringBuilder(String.valueOf(reverse2)); // Convert reverse1 to a String
        reverse3 = input3.reverse(); // Reverse the string

        // Output the reversed string number
        System.out.println("Reverse 3 number (reverse 2 using StringBuilder) = " + reverse3);



        // Close the scanner to free up resources
        scanner.close();

    }
}
