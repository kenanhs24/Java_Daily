package H08_IfElse;

public class MinimumNumber
{
    public static void main (String [] args)
    {

        int a = 10,
                b=30;

        if (a < b)
        {
            System.out.println(a +" is the minimum number");
        }
        if (b < a)
        {
            System.out.println(b +" is the minimum number");
        }
        if (a == b)
        {
            System.out.println("equal");
        }
    }
}
