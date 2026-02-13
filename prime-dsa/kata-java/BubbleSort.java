import java.util.Arrays;

public class BubbleSort {

  public static void bubbleSort(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }
    }
  }

  public static void swap(int[] arr, int i, int j) {

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int[] array = { 11, 3, 6, 7, 4, 1 };
    bubbleSort(array);

    System.out.println(Arrays.toString(array));
  }
}
