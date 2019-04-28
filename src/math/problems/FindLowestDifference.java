package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int[] A = FindLowestDifference.Sorting(array1);
        int[] B = FindLowestDifference.Sorting(array2);

        int n = A[A.length-1];
        for (int i = 0; i < A.length - 1; i++) {
            int a = (A[i + 1] - A[i]);
            if (a < n)
                n = a;
        }
        System.out.println(n);

        int n1 = B[B.length-1];
        for (int i = 0; i < B.length - 1; i++) {
            int b = (B[i + 1] - B[i]);
            if (b < n1)
                n1 = b;
        }
        System.out.println(n1);


    }

    public static int[] Sorting(int[] array) {
        int n = array.length;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;

        }

        return array;
    }
}
