package Java.Maths;

public class BasicMaths {

  public static void main(String[] args) {
    int result = reverseNumber(1345);
    System.out.println(result);
  }

  public static int countDigits(int x){
    int count = 0;

    if(x == 0){ 
      return 1;
    }
    while (x != 0){
      count++;
      x= x/10;
    }
    return count;
  }
  
  public static int countDigitsOptimised(int x){
    int count = (int)(Math.log10(x)+ 1);
    return count;
  }

  public static int reverseNumber(int x){
    int rev = 0;

    while (x != 0) {
        int digit = x % 10;
        rev = rev * 10 + digit; 
        x = x / 10;             
    }
    return rev;
  }

  public boolean isPalindrome(int num) {
    if (num<0){
        return false;
    }
    int originalNum = num;  // Store the original number
    int ans=0;
    while (num>0){
        int rem =num%10;
        num/=10;
        ans=ans*10+rem;
    }
    return originalNum==ans;
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
