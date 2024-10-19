package day03;

public class ReverseString {
    public static void main(String[] args) {

        // 1. Using + (String concatenation) operator
        String str = "ABDCE";
        String reversedStr = "";

        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("reversedStr = " + reversedStr);

        // 2. Using char array
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
        }
        System.out.println("reversedStr using char array = " + sb.toString());

        // 3. Using reverse method
        String reversedStr3 = new StringBuilder(str).reverse().toString();
        System.out.println("reversedStr using reverse method = " + reversedStr3);

        // 4. Using recursion
        String reversedStr4 = reverseRecursively(str, str.length() - 1);
        System.out.println("reversedStr using recursion = " + reversedStr4);
    }

    // Recursive method to reverse a string
    public static String reverseRecursively(String str, int index) {
        if (index < 0) {
            return "";
        }
        return str.charAt(index) + reverseRecursively(str, index - 1);
    }
}
