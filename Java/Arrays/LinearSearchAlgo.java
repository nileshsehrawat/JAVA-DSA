public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 10;
        System.out.println("Element found at index: " + linearSearch(arr, target));

    }

    private static int linearSearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
