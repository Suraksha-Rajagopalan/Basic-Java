import java.util.Scanner;

public class Switchcases {
    public static void main(String[] args){
        System.out.println("1. Press 1 for hi\n2.Press 2 for hello\n3.Press 3 for goodbye");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        switch (num){
            case 1:
            System.out.println("HI");
            break;
            case 2:
            System.out.println("HELLO");
            break;
            case 3:
            System.out.println("GOODBYE");
            break;
            default:
            System.out.println("U can only select 1 2 3");
        }
    }
    
}
