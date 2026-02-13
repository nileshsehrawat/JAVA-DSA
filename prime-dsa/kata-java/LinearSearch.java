
public class LinearSearch {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int f = 5;

    boolean found = search(array, f);
    System.out.println(found);
  }

  private static boolean search(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {

      if (arr[i] == x) {
        return true;
      }
      i++;
    }
    return false;
  }
}
