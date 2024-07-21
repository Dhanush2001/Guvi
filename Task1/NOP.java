import java.util.Scanner;

public class NOP {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0)
        {
            System.out.println("Positive");
        }
        else if(number<0)
        {
            System.out.println("Negative");
        }
        else
            System.out.println("Neither positive nor negative");

    }
}
;;