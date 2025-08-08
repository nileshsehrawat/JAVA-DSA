import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int ans = 0;
        
        while(true){
            System.out.println("Give the operator:");
            char op =in.next().trim().charAt(0);  
            
            if(op == 'x' || op == 'X'){
                break;
            }

            if(op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.println("Enter a number;");
                int a = in.nextInt();
                System.out.println("Enter another number:");
                int b = in.nextInt();

                if(op == '+'){
                    ans = a + b;
                } else if(op == '-'){
                    ans = a - b;
                } else if(op == '*'){
                    ans = a * b;
                } else if(op == '/'){
                    if(b != 0){
                        ans = a / b;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                }

                System.out.println("Result: " + ans);
            } else {
                System.out.println("Invalid operation");
            }
        }

        in.close(); // ✅ close scanner after loop ends
        System.out.println("Calculator exited.");
    }
}