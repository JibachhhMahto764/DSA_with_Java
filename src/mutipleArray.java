import java.util.Arrays;
import java.util.Scanner;

import static java.io.FileDescriptor.in;

public class mutipleArray {
    public static void main(String[] args) {

        /*
        1 2 3
        3 4 5
        6 7 8
         */

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
//                int[][] arr2D = new int[][]{
//                        {12, 13, 14},
//                        {11, 22},
//                        {20,21, 22, 23}
//                };

       // System.out.println(arr.length);

        for (int row = 0; row<arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                 arr[row][col] = in.nextInt();
            }
            System.out.println(arr[row]);
        }
        for (int row = 0; row<arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
            System.out.println(Arrays.toString(arr[row]));
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row])1);
        }
    }

}
