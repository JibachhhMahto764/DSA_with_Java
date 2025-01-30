import java.util.Arrays;
import java.util.Scanner;

import static java.io.FileDescriptor.in;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
