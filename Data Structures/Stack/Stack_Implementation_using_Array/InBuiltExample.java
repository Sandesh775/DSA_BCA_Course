package Stack_Implementation_using_Array;
// Stack itself as generics or datatype in Java
import java.util.Stack;// importing Stack class
public class InBuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Integer is like which type of data we want to store in stack,
        // stack is variable , where haven't set any size so size will be default here
        stack.push(45);
        stack.push(5);
        stack.push(55);
        stack.push(9);
        stack.push(15);
        System.out.println("Removed element from top is :");
        System.out.println(stack.pop());
        System.out.println("Element at the top after removed is : ");
        System.out.println(stack.peek());
    }
}