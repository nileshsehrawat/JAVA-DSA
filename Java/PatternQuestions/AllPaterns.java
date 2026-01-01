package Java.PatternQuestions;

public class AllPaterns {
  public static void main(String[] args){
  binaryRightTriangle(5);
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
}
