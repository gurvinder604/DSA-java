public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {2, 5, 4, 7, 8, 9, 11, 22};
        int target = 23;
        boolean ans1 = LinearSearch4(arr, target);
        int ans2 = linearSearch2(arr, target);
        boolean ans3 = linearSearch3(arr, target);
        System.out.println(ans1);
    }

    // getting the index of the element---
    static int linearSearch1(int[] arr, int target) {
        // if the array is empty ---
        if (arr.length == 0) {
            return -1;
        }

        //running loop to find the target--
        for (int index = 0; index < arr.length; index++) {

            // checking each index comparing with the target--
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    // getting the element itself--
    static int linearSearch2(int[] arr, int target) {
        // if the array is empty---

        //running loop to find the target--
        for (int element : arr) {

            // checking each index comparing with the target--
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    // if we want to return true and false--
    static boolean linearSearch3(int[] arr, int target) {
        // if the array is empty---

        //running loop to find the target--
        for (int element : arr) {
            // checking each index comparing with the target--
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    //using advanced for loop--
    static boolean LinearSearch4(int[] arr, int target) {

        if ( arr.length == 0) {
            return false;
        }

        for ( int element: arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
