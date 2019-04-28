package string.problems;

import java.util.Arrays;

public class Palindrome {
    String a;

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        Palindrome pal = new Palindrome();
        pal.PalindromeMethod("MADAM");


    }

    public void PalindromeMethod(String a) {
        String reverse = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            reverse = reverse + a.charAt(i);
        }
        if (a.equals(reverse)) {
            System.out.println("the word is a palindrome");
        } else {
            System.out.println("the word is not a palindrome");
        }


    }
}
