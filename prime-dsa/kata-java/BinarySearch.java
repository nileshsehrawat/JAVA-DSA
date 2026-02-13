public class BinarySearch {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int tar = 15;

    boolean solution = binarySearch(array, tar);
    System.out.println(solution);
  }

  public static boolean binarySearch(int[] arr, int target) {

    int start = 0;
    int end = arr.length - 1;

    do {
      int mid = start + (end - start) / 2;
      int v = arr[mid];

      if (v == target) {
        return true;
      } else {
        if (v < target) {
          start = mid + 1;
        } else {
          end = mid;
        }
      }
    } while (start < end);

    return false;
  }
}
