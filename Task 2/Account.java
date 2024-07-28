import java.util.Scanner;

public class Account {
    private double balance;
    public Account()
    {
        this.balance=0.0;
    }
    public Account(double balance)
    {
        if(balance>0)
            this.balance=balance;
        else
            System.out.println("balance cannot be negative");
            this.balance=0.0;

    }
    public void deposit(double amount)
    {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount)
    {
        if(amount>0)
            if (amount <= this.balance) {
                this.balance -= amount;
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
        System.out.println("Balance:"+this.balance);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter the Operation" + "\n" + "Enter 1 to deposit" + "\n" + "Enter 2 to withdraw" + "\n" + "Enter 3 to show balance");
            int operation = sc.nextInt();
            double money;
            Account obj = new Account();
            switch (operation) {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    money = sc.nextDouble();
                    obj.deposit(money);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    money = sc.nextDouble();
                    obj.withdraw(money);
                    break;
                case 3:
                    obj.display();
            }
            System.out.println("Enter Y do do other operation");
        }while(sc.next().equals("Y"));
    }

}