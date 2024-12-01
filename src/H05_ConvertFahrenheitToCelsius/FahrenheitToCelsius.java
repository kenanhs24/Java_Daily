package H05_ConvertFahrenheitToCelsius;

import java.util.Scanner;

public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        // Declare a float variable to store the Fahrenheit temperature
        float fahrenheitTemp;

        // Correctly initialize the Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.println("Enter the temperature in Fahrenheit:");

        // Read the temperature as a float
        fahrenheitTemp = input.nextFloat();

        // Convert Fahrenheit to Celsius
        float celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;

        // Display the result
        System.out.printf("The temperature in Celsius is: %.2f%n", celsiusTemp);

        // Close the Scanner object to free resources
        input.close();
    }
}
