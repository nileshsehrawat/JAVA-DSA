package Java.PatternQuestions;

//this file consists of 22 patterns which covers majorly all of the cponcepts for logical thinking

public class AllPaterns {
  public static void main(String[] args){
  reverseAlphabetsPattern(5);
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
}
