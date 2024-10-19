public class findEvenDigits {
    public static void main (String[] args ) {
        int[] array =  {12,2,122,32,6543,4,675,8};
        int ans = FindEvenDigits(array);
        System.out.println(ans);
    }

    static int FindEvenDigits(int[] arr) {
        int count = 0;

        for (int num: arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // to check whether the num contains even digits
    static boolean even(int num) {
        return digits(num) % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }
}
