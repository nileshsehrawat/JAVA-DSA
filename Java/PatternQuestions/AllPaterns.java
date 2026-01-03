package Java.PatternQuestions;

//this file consists of 22 patterns which covers majorly all of the cponcepts for logical thinking

public class AllPaterns {
  public static void main(String[] args){
  concentricNumberPattern(5);
    // System.out.println("hello");
  }

  private static void rectanglePattern(int rows, int cols){
    for (int i =1; i<=rows; i++){
      for (int j=1; j<=cols; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  private static void squarePattern(int rows){
    for (int i =1; i<=rows; i++){
      for (int j=1; j<=rows; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  private static void rightAngleTrianglePattern(int rows){
    for (int i =1; i<=rows; i++){
      for (int j=1; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  private static void numbersRightAngleTrianglePattern(int rows){
    for (int i =1; i<=rows; i++){
      for (int j=1; j<=i; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
  private static void repeatNumberPattern(int rows){
    for (int i=1; i<rows; i++){
      for (int j=1; j<=i; j++){
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
  private static void invertedTriangle(int row){
    for(int i =row; i>1; i--){
      for (int j=1; j<i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  private static void numbersInvertedTriangle(int row){
    for (int i= row; i>1; i--){
      for (int j=1; j<i; j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
  private static void pyramidPattern(int rows) {
    for (int i = 1; i <= rows; i++) {

        // spaces
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }

        // stars
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }

        System.out.println();
    }
  }
  private static void reversePyramidPattern(int rows){
    for (int i= 1; i<= rows; i++){
      for(int j= 1; j<= i; j++){
        System.out.print(" ");
      }
      for(int k=1; k<= rows - i + 1; k++){
        System.out.print("* ");
      }
      System.out.println();
    }
    
  }
  private static void diamondPattern(int rows){
    for( int i = 1; i<= rows; i++){
      //spaces
      for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
      }
      // stars
      for (int k = 1; k <= i; k++) {
        System.out.print("* ");
      }    
      System.out.println();
    }
    for (int i = 1; i < rows; i++) {
      for(int j= 1; j<= i; j++){
        System.out.print(" ");
      }
      for(int k=1; k<= rows - i; k++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  private static void halfDiamondPattern(int rows){
    for(int i= 1; i<= rows; i++){
      for(int j= 1; j<= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i < rows; i++) {
      for (int j = 1; j <= rows - i; j++) {
          System.out.print("*");
      }
    System.out.println();
    }
  }
  private static void binaryRightTriangle(int rows){
    for(int i= 1; i<= rows; i++){
      for(int j=1 ; j<=i; j++){
        if((i+j) % 2 ==0){
          System.out.print("1");
        }
        else{
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }
  private static void vPattern(int rows){
    for (int i = 1; i<=rows; i++){

      for (int j=1; j<=i; j++){
        System.out.print(j);
      }
      for(int k= 1; k<= 2* (rows- i); k++){
        System.out.print(" ");
      }
      for(int j= i; j>= 1; j--){
        System.out.print(j);
      }
      System.out.println();
    }
  }
  private static void incrementalTrianglePattern(int rows){
    int a= 1;
    for (int i = 1; i<=rows; i++){
      for (int j=1; j<=i; j++){
        System.out.print(a + " ");
        a++;
      }
      System.out.println();
    }
  }
  private static void alphabetsTrianglePattern(int rows){
    for (int i = 1; i<=rows; i++){
      char ch = 'A';
      for (int j=1; j<=i; j++){
        System.out.print(ch + " ");
        ch++;
      }
      System.out.println();
    }
  }
  private static void alphabetsReverseTrianglePattern(int rows){
    for (int i = rows; i>=1; i--){
      char ch = 'A';
      for (int j= 1; j<=i; j++){
        System.out.print(ch + " ");
        ch++;
      }
      System.out.println();
    }
  }
  private static void repeatAlphabetPattern(int rows){
    char ch = 'A';
    for (int i = 1; i<= rows; i++){
      for (int j= 1; j<=i; j++){
        System.out.print(ch + " ");
      }
      ch++;
      System.out.println();
    }
  }
  private static void alphabetsPyramidPattern(int rows){
    for( int i= 1; i<= rows; i++){
      //spaces
      for (int j= 1; j<= rows - i; j++){
        System.out.print(" ");
      }
      char ch= 'A'; 
      //print
      for (int k=1; k<= i; k++){
        System.out.print(ch +" ");
        ch++;
      }
      ch--;
      for (int l= 1; l< i; l++){
        ch--;
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }
  private static void reverseAlphabetsPattern(int rows){
    for(int i= 1; i<= rows; i++){
      char ch = (char) ('A' + rows - i);
      for(int j= 1; j<= i; j++){
        System.out.print(ch + " ");
        ch++;
      }
      System.out.println();
    }
  }
  private static void hollowHourglassPattern(int rows){
    for(int i= rows ; i>= 1; i--){
      for(int j= 0; j< i; j++){
        System.out.print("*");
      }

      for(int k= 0; k< 2* (rows-i); k++){
        System.out.print(" ");
      }

      for(int l= i; l>=1; l--){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int p= 2; p<= rows; p++){
      for(int j= 1; j<= p; j++){
        System.out.print("*");
      }

      for (int k = 0; k < 2 * (rows - p); k++){
        System.out.print(" ");
      }

      for (int l = 1; l <= p; l++) {
            System.out.print("*");
        }
      System.out.println();
    }
  }
  private static void butterflyPattern(int rows){
    for (int i = 1; i <= rows; i++) {

        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        for (int j = 1; j <= 2 * (rows - i); j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        System.out.println();
    }

    for (int i = rows - 1; i >= 1; i--) {

        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        for (int j = 1; j <= 2 * (rows - i); j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
  }
  private static void hollowSquarePattern(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {

            // border condition
            if (i == 1 || i == n || j == 1 || j == n) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
  }
  private static void concentricNumberPattern(int n) {
    int size = 2 * n - 1;

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {

            int top = i;
            int left = j;
            int right = size - 1 - j;
            int bottom = size - 1 - i;

            int minDist = Math.min(
                Math.min(top, bottom),
                Math.min(left, right)
            );

            System.out.print((n - minDist) + " ");
        }
        System.out.println();
    }
}
}
