import java.util.Scanner;
import java.util.regex.Pattern;

class AgeNotWithinRangeException extends Exception
{
    public AgeNotWithinRangeException(String message)
    {
        super(message);
    }
}
class NameNotValidException extends Exception{
    public NameNotValidException(String message)
    {
        super(message);
    }
}
class Student

{
    private String name;
    private int roll_no;
    private int age;
    private String course;

    public Student(int roll_no, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException
    {
        this.roll_no=roll_no;
        this.course=course;
        this.age=age;
        if(age<15|| age>21)
        {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21");
        }
        this.name=name;
        if(!isValidName(name))
        {
            throw new NameNotValidException("Name contains invalid characters");
        }

    }
    private boolean isValidName(String name) {
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s]+$");
        System.out.println(pattern.matcher(name).matches());
        return pattern.matcher(name).matches();
    }
    public String toString() {
        return "Student{" + "rollNo=" + roll_no + ", name='" + name + '\'' + ", age=" + age + ", course='" + course + '\'' + '}';
    }
}
public class StudentManagementSystem{
    public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Student details:");
        System.out.println("Enter Roll No");
        int roll_no= scanner.nextInt();
        System.out.println("Enter Name:");
        String name=scanner.next();
        scanner.nextLine();
        System.out.println("Enter age");
        int age= scanner.nextInt();
        System.out.println("Enter Course");
        String course=scanner.next();
        scanner.nextLine();
        try
        {
            Student student = new Student(roll_no, name, age, course);
            System.out.println(student);
        }
        catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}

