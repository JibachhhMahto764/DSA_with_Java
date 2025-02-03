public class ColNoFixsize {
    public static void main(String[] args) {
        int[][] arr= {

                { 12,13,14,15},
                {23,34,43},
                {31,12,32,132,2}
        };
        for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col< arr[row].length; col++){
            System.out.print(arr[row][col] + " ");
        }
            System.out.println();
        }
    }
}
