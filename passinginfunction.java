import java.lang.reflect.Array;
import java.util.Arrays;

public class passinginfunction {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,45,2};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    // here java mutuble means the value which is change
    static void change(int[] arr){
        arr[0] = 99;
    }
}
