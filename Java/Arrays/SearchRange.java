import java.util.Scanner;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 89, 18, 54, 2, 18, 65 };
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the target element:");
        int target = a.nextInt();
        System.out.println("Enter the start and end index:");
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int start = in.nextInt();
        int end = sc.nextInt();
        int result = searchInRange(arr, start, end, target);
        System.out.println(result);

        a.close();
        sc.close();
        in.close();
    }

    static int searchInRange(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }
        if (start > end) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
