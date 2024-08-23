import java.util.HashMap;
import java.util.Scanner;

public class Grades {
    private HashMap<String, Integer> student;
    public Grades() {
        student = new HashMap<>();
    }
    public void addStudent(String name,int grade)
    {
        student.put(name,grade);
        System.out.println("Added student: " + name + " with grade: " + grade);
    }
    public void removeStudent(String name) {
        if (student.containsKey(name)) {
            student.remove(name);
            System.out.println("Removed student: " + name);
        } else {
            System.out.println("Student " + name + " does not exist.");
        }
    }
    public void displayStudentGrade(String name) {
        if (student.containsKey(name)) {
            int grade = student.get(name);
            System.out.println("Student: " + name + " has grade: " + grade);
        } else {
            System.out.println("Student " + name + " does not exist.");
        }
    }

    public static void main(String[] args){
        Grades grades=new Grades();
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the operation to be performed");
            System.out.println("1.Add Student \n2.Remove Student\n3.Display Student Details\n4.Exit");
            int operation= scanner.nextInt();
            switch (operation)
            {
                case 1:
                    System.out.print("Enter Student Name:");
                    String addName = scanner.next();
                    System.out.print("Enter student grade: ");
                    int addGrade = scanner.nextInt();
                    scanner.nextLine();
                    grades.addStudent(addName,addGrade);
                    break;
                case 2:
                    System.out.println("Enter Student name to remove the record");
                    String removeName = scanner.next();
                    grades.removeStudent(removeName);
                    break;
                case 3:
                    System.out.println("Enter Student name to get marks the record");
                    String displayName = scanner.next();
                    grades.displayStudentGrade(displayName);
                    break;
                case 4:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
        }
}
