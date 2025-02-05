public class SearchInString {
    public static void main(String[] args) {
        String name = "Nilesh";
        char target = 's';
        System.out.println(search(name, target));
    }

    static /* boolean */ int search(String str, char target) {
        if (str.length() == 0) {
            // return false;
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                // return true;
                return i;
            }
        }
        // return false;
        return -1;

    }
}