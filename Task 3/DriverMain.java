import java.util.Scanner;

interface Taxable{
    double salesTax=0.07;
    double incomeTax= 0.105;
    double calcTax();
}
class Employee implements Taxable{
    private String empID;
    private String name;
    private double salary;
    public Employee(String empID,String name,double salary)
    {
        this.empID=empID;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public double calcTax() {
        return incomeTax*salary;
    }
}
class Product implements Taxable{
    private double price;
    private String pid;
    private int quantity;
    public Product(String pid,double price,int quantity)
    {
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }
    public double calcTax()
    {
        return price*quantity*salesTax;
    }
}
public class DriverMain {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        String empID=sc.nextLine();
        System.out.println("Enter Employee Name:");
        String name=sc.nextLine();
        System.out.println("Enter Employee Salary:");
        double salary = sc.nextDouble();
        Employee employee = new Employee(empID, name, salary);
        double incomeTax = employee.calcTax();
        System.out.printf("Income Tax for Employee: %.2f\n", incomeTax);

        System.out.println("Enter Product ID:");
        String pid = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Product Price:");
        double price = sc.nextDouble();
        System.out.println("Enter Product Quantity:");
        int quantity = sc.nextInt();
        Product product = new Product(pid, price, quantity);
        double salesTax = product.calcTax();
        System.out.printf("Sales Tax for Product: %.2f\n", salesTax);
    }
}
