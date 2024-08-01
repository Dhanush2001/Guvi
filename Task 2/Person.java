import java.util.Scanner;

public class Person
{   private int age;
    private String name;
    public Person()
    {
        this.name="Unknown";
        this.age=18;
    }
    public Person(String name,int age)
    {
        this.name=name;
        if(age>=0)
        {
            this.age=age;
        }
        else
        {
            System.out.println("Age cannot be negative");
            this.age=18;
        }

    }


    public static void main(String[] args)
    {
        Person person=new Person();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        person.name=sc.next();
        System.out.println("Enter Age:");
        person.age=sc.nextInt();
        person.display();
        Person person1 =new Person("Hugh",30);
        person1.display();
    }
    public void display()
    {
        System.out.println("Name:"+name+"\n"+"Age:"+age);
    }
}
