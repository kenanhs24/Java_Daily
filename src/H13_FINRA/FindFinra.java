package H13_FINRA;

public class FindFinra {

    public static void main(String[] args) {
        // Call the findFinra method with the desired number
        findFinra(30);
    }

    public static void findFinra(int number) {
        for (int i = 1; i <= number; i++) { // Loop from 1 to the given number
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA"); // Divisible by both 3 and 5
            } else if (i % 3 == 0) {
                System.out.println("FIN"); // Divisible by 3
            } else if (i % 5 == 0) {
                System.out.println("RA"); // Divisible by 5
            } else {
                System.out.println(i); // Not divisible by 3 or 5
            }
        }
    }
}

/*
*
Create a class called FINRA,
* Write a function which prints out the number.
*  but for number which is a multiple of 3,
* print "FIN" instead of the number and for number which is a multiple of 5,
*  print "RA" instead of the number. and for number which is a multiple of both 3 and 5,
* print "FINRA" instead of the number.
            ex:
                number = 3

                output:
                      FIN


                number = 10

	            output:
	                RA


            	number = 15

	            output:
	                FINR

 */