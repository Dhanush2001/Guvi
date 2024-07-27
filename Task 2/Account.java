import java.util.Scanner;

public class Account {
    private double balance;
    public Account()
    {
        this.balance=0.0;
    }
    public Account(double balance)
    {

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account number");
        System.out.println("Enter the Operation"+"\n"+"Enter 1 to deposit"+"\n"+"Enter 2 to withdraw"+"\n"+"Enter 3 to show balance");
        String operation=sc.next();
        int money;
        Account obj=new Account();
        switch(operation):
        {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    money=sc.nextInt();
        }



    }
    public void deposit(int amount)
    {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }
    public void withdraw(int amount)
    {
        if(amount>0)
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Error: Insufficient funds.");
            }
        else
        {
            System.out.println("Withdrawal amount cannot be negative");
        }
    }
    public void display()
    {
        System.out.println("Balance:"+balance);
    }
}