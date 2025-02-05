import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    // static void reverseArray(int[] arr) {
    // for (int i = arr.length - 1; i >= 0; i--) {
    // System.out.print(arr[i] + " ");
    // }
    // }
    static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
