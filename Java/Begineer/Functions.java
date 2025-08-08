import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args){
        // Scanner in= new Scanner(System.in);
        // String name= in.next();
        
        // String message= Greet(name);
        // System.out.println(message);
        // in.close();

        // int x= 5;
        // int y= 7;
        // int[] swapped = swapNums(x,y);
        // System.out.println(Arrays.toString(swapped));
    }
    // Function with arguent passed
    static String Greet(String name){
        String greetings = "How are you "+ name;
        return greetings;
    }

    static int Sum(int a, int b){
        int sum = a+ b;
        return sum;
    }

    static int[] swapNums(int a, int b){
        int temp= a;
        a= b;
        b= temp;
        return new int[]{a,b};
    }
    
}
