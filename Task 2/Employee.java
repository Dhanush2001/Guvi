import java.util.Scanner;

class Person1{
    private String name;
    private int age;
    public Person1(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Employee extends Person1{
    private String employeeID;
    private double salary;
    public Employee(String name, int age,String employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
    public String getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void displayPerson() {
        super.displayPerson();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee details");
        System.out.println("Enter name:");
        String name=sc.next();
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        System.out.println("Enter Employee ID:");
        String empid=sc.next();
        System.out.println("Enter Salary:");
        double salary=sc.nextDouble();
        Employee employee=new Employee(name,age,empid,salary);
        employee.displayPerson();
    }

}
