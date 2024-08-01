import java.util.Scanner;

public class Account {
    private double balance;
    public Account()
    {
        this.balance=balance;
    }
    public Account(double balance)
    {
        if(balance>0)
            this.balance=balance;
        else
            System.out.println("balance cannot be negative");

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
        Account account = new Account();
        do {
            System.out.println("Enter the Operation" + "\n" + "Enter 1 to deposit" + "\n" + "Enter 2 to withdraw" + "\n" + "Enter 3 to show balance");
            int operation = sc.nextInt();
            double money;

            switch (operation) {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    money = sc.nextDouble();
                    account.deposit(money);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    money = sc.nextDouble();
                    account.withdraw(money);
                    break;
                case 3:
                    account.display();
                    break;
            }
            System.out.println("Enter Y do do other operation");
        }while(sc.next().equals("Y"));
    }

}
