public class MaxValue {

    public static void main(String[] args) {
        int[] arr = { 1, 9, 3, 18, 5 };
        System.out.println("Max value in the array is: " + maxValue(arr));

    }

    static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}