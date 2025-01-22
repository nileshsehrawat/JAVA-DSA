import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String day = in.next();
        //Switch(1);

        switch(day){
            case "1":
                System.out.println("MONDAY");
                break;
            case "2":
                System.out.println("TUESDAY");
                break;
            case "3":
                System.out.println("WEDNESDAY");
                break;
            case "4":
                System.out.println("THURSDAY");
                break;
            case "5":
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("SUNDAY");
        }

    }
}
