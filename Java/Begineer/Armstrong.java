import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();// input 153 output true
        System.out.println(isArmstrong(n));
        in.close();
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum = sum + rem * rem * rem;
        }
        if (sum == original) {
            return true;
        }
        return false;

    }
}
