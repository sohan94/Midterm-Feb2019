package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */

        for (int i = 0; i < 6; i++) {

            for (int j = 6; j >= i; j--) {
                System.out.print("");
            }
            for (int z = 0; z <= i; z++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }
}
