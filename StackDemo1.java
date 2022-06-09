import java.util.*;
  
public class StackDemo {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
  
        stack.add("Geeks");
        stack.add("for");
        stack.add("Geeks");
        stack.add("10");
        stack.add("20");
 
        System.out.println("Stack: " + stack);

        String rem_ele = stack.remove(4);
  
        // Print the removed element
        System.out.println("Removed element: "
                           + rem_ele);
  
        // Print the final Stack
        System.out.println("Final Stack: "
                           + stack);
    }
}


OUTPUT
...............
Stack: [Geeks, for, Geeks, 10, 20]
Removed element: 20
Final Stack: [Geeks, for, Geeks, 10]
