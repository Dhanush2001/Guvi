import java.util.Scanner;
import java.util.Stack;

public class IntegerStack {
   private Stack<Integer> integerStack;
   public IntegerStack()
   {
       integerStack=new Stack<>();
   }
   public void pushElement(int element)
   {
       integerStack.push(element);
       System.out.println("Pushed element: " + element);
   }
   public void popElemnt()
   {
       if (!integerStack.isEmpty()) {
           int removedElement = integerStack.pop();
           System.out.println("Popped element: " + removedElement);
       } else {
           System.out.println("Stack is empty. Nothing to pop.");
       }
   }
    public boolean isEmpty() {
        return integerStack.isEmpty();
    }
    public static void main(String[] args)
    {
        IntegerStack intStack=new IntegerStack();
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the operation to be performed");
            System.out.println("1.Push Element on to the stack \n2.Pop element from the stack\n3.Check if Stack is Empty \n4.Exit");
            int operation= scanner.nextInt();
            switch (operation)
            {
                case 1:
                    System.out.print("Enter integer to push: ");
                    int elementToPush = scanner.nextInt();
                    intStack.pushElement(elementToPush);
                    break;
                case 2:
                    intStack.popElemnt();
                    break;
                case 3:
                    if (intStack.isEmpty()) {
                        System.out.println("The stack is empty.");
                    } else {
                        System.out.println("The stack is not empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");

            }
        }
    }
}

