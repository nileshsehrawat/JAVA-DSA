public class MaxMinValue {

    public static void main(String[] args) {
        int[] arr = { 1, 9, 3, 18, 5 };
        System.out.println("Max value in the array is: " + maxValue(arr));
        System.out.println("Min value in the array is: " + minValue(arr));

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

    static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}