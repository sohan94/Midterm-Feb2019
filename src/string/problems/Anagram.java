package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    String a;
    String b;

     public void anangram(String a, String b)
    {

        char[] aA = a.toCharArray();
        char[] aB = b.toCharArray();

        Arrays.sort(aA);
        Arrays.sort(aB);

        if(Arrays.equals(aA, aB)) {

            System.out.println("Anangram, YAY!");
        } else {
            System.out.println("Try again");
        }

    }

    public static void main(String[] args) {

         Anagram anan = new Anagram();
         anan.anangram("CAT", "ACT");

      //  Scanner scan = new Scanner(System.in);
      //  System.out.println("1st name");
      //  String first =scan.nextLine();
      //  System.out.println("2st name");
      //  String second =scan.nextLine();
       // anangram(cat,act)

    }
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    }
