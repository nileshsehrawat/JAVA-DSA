import java.util.Arrays;

public class Search2d {
    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 7;
        int[] result = search2d(array, target);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(maxNum(array)));

    }

    static int[] search2d(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] maxNum(int[][] arr) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }
        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[] { max, row, col };
    }

}
