package Java.Maths;

import java.util.ArrayList;
import java.util.List;

public class BasicMaths {

  public static void main(String[] args) {
    boolean result = isPrime(10);
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

  public static int findGcd(int a,  int b){
    // int gcd = 1;
    for( int i = 1; i<= Math.min(a,b); i++){
      if(a % i == 0 && b % i ==0){
        // gcd = i;
        return i;
      }
    }
    // return gcd;
    return 1;
  }

  public static int euclideanAlgorithmGcd(int a, int b){
    while(a> 0 && b> 0){
      if(a> b){
        a= a% b;
      }else{
        b= b% a;
      }
    }
    if (a == 0){
      return b;
    }
    return a;
  }

  public static List<Integer> findAllDivisors(int n){
    List<Integer> res = new ArrayList<>();

    for(int i = 1; i<= n; i++){
      if(n % i == 0){
        res.add(i);
      }
    }
    return res;
  }

  public static boolean isPrime(int n){
    int count = 0;
    for(int i = 1; i<= n; i++){
      if (n % i == 0){
        count++;
      }
    }
    return count == 2;
  }
}
