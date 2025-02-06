// leetcode 852. Peak Index in a Mountain Array

public class BitonicArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid; // peak is on the left side,and we are not discarding the mid element
            } else {
                start = mid + 1; // peak is on the right side, and we are discarding the mid element
            }
        }
        return start;
    }
}
