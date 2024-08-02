import java.util.Scanner;

class AgeNotValidException extends Exception{
    public AgeNotValidException(String message){
        super(message);
    }
}
public class Voter {
    private String voterId;
    private String name;
    private int age;
    public Voter(String voterId,String name,int age) throws AgeNotValidException
    {
        this.voterId=voterId;
        this.name=name;
        this.age=age;
        if(age<18)
        {
            throw new AgeNotValidException("invalid age for voter");
        }
    }
    public String toString()
    {
        return "Voter Details{"+"Voter ID:"+voterId+", Name:"+name+", Age:"+age;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Voter Details:");
        System.out.println("Enter Voter ID:");
        String voterId=scanner.next();
        System.out.println("Enter Voter Name:");
        String name=scanner.next();
        System.out.println("Enter Voter age:");
        int age=scanner.nextInt();
        try{
            Voter voter=new Voter(voterId,name,age);
            System.out.println(voter);

        } catch (AgeNotValidException e) {
            System.out.println("Exception caught:"+e.getMessage());
        }
    }
}
