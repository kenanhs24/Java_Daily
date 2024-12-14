package H11_Loop;

public class PrintStarUsingForLoop {
    public static void main(String[] args) {
        int rows = 10; // Total number of rows in the triangle

        for (int row = 1; row <= rows; row++) { // Outer loop for rows
            for (int star = 1; star <= row; star++) { // Inner loop for stars in each row
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing stars in the current row
        }
    }
}
