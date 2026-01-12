package Java.Recursion;

public class BasicRecursion {
  public static void main(String[] args) {
    int N = 3;
    printName(N);
  }

  static void printName(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Print once
        System.out.print("Nilesh ");

        // Recursive call
        printName(n - 1);
    }
}
