import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMax2D {
    public static void main(String[] args) {
        int[][] arr = {
                {3,7,55,3},
                {34,65,43,54,5},
                {45,7,62,14,5}
        };

        int MaxVal = FindMax2D(arr); // maximum value
        int[] MaxIndex = FindMaxIndex(arr); // Index of maximum value
        System.out.println(MaxVal);
        System.out.println("At Index");
        System.out.println(Arrays.toString(MaxIndex));
    }

    // Maximum value in 2D array
    static int FindMax2D(int[][] arr) {
        int max = arr[0][0];
        for (int row = 0; row<arr.length; row++) {
            for (int col = 0; col<arr[row].length; col++)  {
                if (arr[row][col] >= max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    // Maximum index
    static int[] FindMaxIndex(int[][] arr) {
        int max = arr[0][0];
        int[] index = {0, 0};
        for (int row = 0; row<arr.length; row++) {
            for (int col = 0; col<arr[row].length; col++)  {
                if (arr[row][col] >= max) {
                    max = arr[row][col];
                    index = new int[]{row, col};
                }
            }
        }
        return index;
    }
}
