package Java.Recursion;

public class BasicRecursion {
  public static void main(String[] args) {
    // int N = 3;
    // System.out.println(factorialN(N));
    int[] arr = {1,2,3,4,5};
    reverseArrFunc(arr);
    for(int num : arr){
      System.out.println(num + " ");
    }
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

  static void printNNumbers(int n){
    if(n == 0){
      return;
    }
    printNNumbers(n-1);
    System.out.println(n);
  }

  static int sumN(int n){
    if(n == 0){
      return 0;
    }
    return n + sumN(n-1);
  }
  static int factorialN(int n){
    if(n == 0 || n == 1){
      return 1;
    }

    return n * factorialN(n-1);
  }

  static void reverseArray(int[] arr, int i){
    int n = arr.length;
    if (i >= n / 2){
      return;
    }
    //swap
    int temp = arr[i];
    arr[i] = arr[n-i-1];
    arr[n-i-1] = temp;

    //recursive call
    reverseArray(arr,i+1);
  }

  static void reverseArrFunc(int[] arr){
    reverseArray(arr, 0);
  }

  
}
