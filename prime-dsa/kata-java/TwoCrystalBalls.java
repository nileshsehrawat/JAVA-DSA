
public class TwoCrystalBalls {
  public static void main(String[] args) {
    boolean[] arr = new boolean[100];

    // Suppose it starts breaking at index 37
    for (int i = 37; i < arr.length; i++) {
      arr[i] = true;
    }
    int result = twoCrystalBalls(arr);
    System.out.println("Breaking point: " + result);
  }

  public static int twoCrystalBalls(boolean[] breaks) {

    int jumpAmount = (int) Math.floor(Math.sqrt(breaks.length));

    int i;
    for (i = jumpAmount; i < breaks.length; i += jumpAmount) {
      if (breaks[i]) {
        break;
      }
    }

    i = i - jumpAmount;

    for (int j = 0; j < jumpAmount && i < breaks.length; j++, i++) {
      if (breaks[i]) {
        return i;
      }
    }

    return -1;
  }
}
