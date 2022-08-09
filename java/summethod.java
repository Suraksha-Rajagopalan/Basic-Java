import java.util.Scanner;

public class summethod {
    static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] agrs){
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = scan1.nextInt();
        System.out.println("Enter second number:");
        int y = scan2.nextInt();
        int ans = sum(x,y);
        System.out.println("The sum of 2 numbers is: "+ans);
    }
}
