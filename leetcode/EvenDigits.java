// question 1295 leetcode.
// Even digits
public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7890 };
        System.out.println("EVEN NUMBERS IN THE ARRAY :" + findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums) {
        int numberOfDigits = digits(nums);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
