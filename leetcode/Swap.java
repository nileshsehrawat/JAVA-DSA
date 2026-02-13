import java.util.Arrays;

public class Swap {
  public static void main(String[] args) {
    int q = 11;
    int w = 22;
    System.out.println("Before swap: q = " + q + ", w = " + w);
    int[] result = swapNum(q, w);
    System.out.println("After swap: q = " + result[0] + ", w = " + result[1]);

    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
    System.out.println(Arrays.toString(array));
    swapArray(array, 2, 6);
    System.out.println("Swapped array is" + Arrays.toString(array));

  }

  static int[] swapNum(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    return new int[] { a, b }; // Return swapped values
  }

  static void swapArray(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
    // return temp;
  }
}
