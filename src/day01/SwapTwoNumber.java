package day01;

import java.util.Arrays;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 10 , b = 20;
        System.out.println("Before Swapping values are  a = " + a +"  b = "+ b);
            //Before Swapping values are  a = 10  b = 20


        // way-1 use third variable
        int t = a;
        a=b;
        b=t;

        System.out.println("After way 1 Swapping values are  a = " + a +"  b = "+ b);
        //After way 1 Swapping values are  a = 20  b = 10


        // way-2 use " + " without using third variable

        a= a+b;
        b= a-b;
        a=a-b;

        System.out.println("After way 2 Swapping values are  a = " + a +"  b = "+ b);
        //After way 2 Swapping values are  a = 10  b = 20



        // way -3 use  " * " without using third variable a,b should not be  = 0

        a =a*b;
        b=a/b;
        a=a/b;

        System.out.println("After way 3 Swapping values are  a = " + a +"  b = "+ b);
        //After way 3 Swapping values are  a = 20  b = 10


        // way -4  single statement

        b= a+b-(a=b);

        System.out.println("After way 4 Swapping values are  a = " + a +"  b = "+ b);
        //After way 4 Swapping values are  a = 10  b = 20


    }
}
