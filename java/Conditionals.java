import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args)
    {
        System.out.println("Enter your current age: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age>55)
        {
            System.out.println("You are a senior citizen");
        }
        else
        {
            System.out.println("You are not a senior citizen");
        }
    }
    
}
