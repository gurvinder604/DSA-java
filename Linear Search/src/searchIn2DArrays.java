import java.util.Arrays;

public class searchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {3,7,55,3},
                {34,65,438,54,5},
                {45,7,65,14,5}
        };

        int target = 438;
        int[] ans = searchIn2DArrays(arr, target);
        System.out.println(Arrays.toString(ans)); // find target
    }

    static int[] searchIn2DArrays(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length ; col++) {
                if (array[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
