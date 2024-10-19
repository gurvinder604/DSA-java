public class searchInRanges {
    public static void main(String[] args) {
        int[] array = {2, 5, 88, 7, 4, -1 ,12, 14};
        int target = 4;
        String strg = "Garry";
        char ctarget = 'w';
        //System.out.println(linearSearch(array, target, 2, 6)); //string
        System.out.println(SearchChar(strg, ctarget)); //array
    }
    // searching in range--
    static int linearSearch(int[] arr,int target, int start, int end) {
        // if the array is empty ---
        if (arr.length == 0) {
            return -1;
        }

        //running loop to find the target--
        for (int index = start; index <= end; index++) {

            // checking each index comparing with the target--
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    // searching in range in strings
    static boolean SearchChar(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (char ch: str.toCharArray()) {
            if (ch == target)
                return true;
        }

        return false;
    }
}
