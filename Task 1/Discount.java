import java.util.Scanner;

public class Discount {
    public static void main(String[] args)
    {
        System.out.println("Enter the Amount:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        float totalAmount=0;
        if(number<500)
        {
            totalAmount=number;
        }
        else if(number>=500 && number<=1000)
        {
            totalAmount= (float) ((float)number*0.9);

        }
        else if(number>1000)
        {
            totalAmount=(float) ((float)number*0.8);
        }
        else
        {
            System.out.println("enter a valid amount");
        }
        System.out.println("Total Amount after Discount:"+totalAmount);
    }
}
