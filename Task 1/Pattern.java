import java.util.Scanner;

public class Pattern {
    public static void main(String[] args)
    {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=1;i<=number;i++)
        {
            for(int j=number;j>number-i;j--)
            {
                System.out.print(j);
            }
            for(int j=1;j<=number-i;j++)
            {
                System.out.print(number-i+1);
            }

            System.out.println();
        }
    }

}
