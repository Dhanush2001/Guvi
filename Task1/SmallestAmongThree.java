import java.util.Scanner;

public class SmallestAmongThree {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int number1 = sc.nextInt();
        System.out.println("Enter the First Number:");
        int number2 = sc.nextInt();
        System.out.println("Enter the First Number:");
        int number3 = sc.nextInt();
        int small= number1<number2?number1:number2;
        int smallest=number3<small?number3:small;
        System.out.println("Smallest number among three numbers is:"+smallest);


    }
}
