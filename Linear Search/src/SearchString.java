import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {
        String name = "Garry";
        char target = 's'; //false
        System.out.println(Arrays.toString(name.toCharArray()));// character array
    }

    // function for searching character in strings---
    static boolean Search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    //using advance for loop--
    static boolean Search2(String str, char target) {
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


