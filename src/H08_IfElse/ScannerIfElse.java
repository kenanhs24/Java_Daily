package H08_IfElse;

import java.util.Scanner;

public class ScannerIfElse
{
    public static void main(String[] args)
    {
       int marksObtained, passingMarks;

       passingMarks = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks scored by you: ");
        marksObtained = sc.nextInt();

        if (marksObtained >= passingMarks)
        {
            System.out.println("You passed the exam!");
        }
        else
        {
            System.out.println("Unfortunately You failed !!!");
        }
    }
}
