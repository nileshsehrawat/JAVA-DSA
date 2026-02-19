public class QuickSort {

  public static void quickSort(int[] arr) {
    qs(arr, 0, arr.length - 1);
  }

  private static void qs(int[] arr, int lo, int hi) {

    // Base case
    if (lo >= hi) {
      return;
    }

    int pivotIndex = partition(arr, lo, hi);

    // Sort left side
    qs(arr, lo, pivotIndex - 1);

    // Sort right side
    qs(arr, pivotIndex + 1, hi);
  }

  private static int partition(int[] arr, int lo, int hi) {

    int pivot = arr[hi]; // choose last element as pivot
    int idx = lo - 1; // boundary for smaller elements

    for (int i = lo; i < hi; i++) {

      if (arr[i] <= pivot) {
        idx++;

        // swap arr[i] and arr[idx]
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
      }
    }

    // place pivot in correct position
    idx++;
    int temp = arr[hi];
    arr[hi] = arr[idx];
    arr[idx] = temp;

    return idx; // pivot final index
  }

  // Test
  public static void main(String[] args) {

    int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };

    quickSort(arr);

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
