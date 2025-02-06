// Leetcode question 941. Valid Mountain Array
// Given an array of integers arr, return true if and only if it is a valid mountain array.
public class ValidMouintainArray {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 2, 1 };
        System.out.println(validMountainArray(arr));

    }

    static boolean validMountainArray(int[] arr) {
        int len = arr.length;
        int i = 0;
        while (i + 1 < len && arr[i] < arr[i + 1]) {
            i++;
        }
        if (i == 0 || i == len - 1) {
            return false;
        }
        while (i + 1 < len && arr[i] > arr[i + 1]) {
            i++;
        }
        return i == len - 1;
    }
}
