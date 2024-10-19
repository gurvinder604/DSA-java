public class findMin {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 6, -1, 5, 88, 93};
        System.out.println(Min(arr)); //min
        System.out.println(Max(arr)); //max
    }

    static int Min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int Max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
