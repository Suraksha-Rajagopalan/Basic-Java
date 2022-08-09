import java.util.Scanner;

public class ifelse {
    public static void main(String[] args)
    {
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a<0)
        {
            System.out.println("Entered a negative integer");
        }
        else if (a<10 && a>0)
        {
            System.out.println("Entered a single digit number");
        }
        else if (a<100 && a>9)
        {
            System.out.println("Entered a two digit number");
        }
        else if (a==0)
        {
            System.out.println("Entered a zero");
        }
        else 
        {
            System.out.println("Number is greater than 99");
        }
    }
    
}
