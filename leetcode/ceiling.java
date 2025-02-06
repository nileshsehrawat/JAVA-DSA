// Leetcode easy Q 744 Find Smallest Letter Greater Than Target

public class ceiling {
    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j', 'p', 'v', 'z' };
        char target = 'l';
        char result = nextGreatestLetter(arr, target);
        System.out.println(result);

        int[] arr1 = { 4, 6, 10, 15, 18, 20, 3, 1 };
        int target1 = 16;
        int result1 = nextGreatestNumber(arr1, target1);
        System.out.println(result1);
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    private static int nextGreatestNumber(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < numbers[mid]) {
                end = mid - 1;
            } else {

                start = mid + 1;
            }
        }
        return numbers[start % numbers.length];
    }
}
