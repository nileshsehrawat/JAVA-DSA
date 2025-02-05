import java.util.Scanner;

public class CountOccurrenceOf0 {
    public static void main(String[] ags) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
        in.close();
    }

}
