
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int target = 7;
        int result = orderAgnosticBS(array, target);
        System.out.println(result);
    }

    private static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isASC = arr[start] < arr[end];

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else {
                if (isASC) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (target < arr[mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;

    }

}
