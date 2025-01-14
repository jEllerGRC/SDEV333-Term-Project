/**
 *  This is a test client for the ResizingArrayStack and LinkedStack classes.
 *  @author Jared Eller
 *  @verison 1.0
 *  @date 2/20/24
 */


import java.util.Scanner;

public class StackTestClient
{
    public static void main(String[] args) {
//        Stack<String> s = new ResizingArrayStack<String>();
        Stack<String> s = new LinkedStack<>();
        Scanner in = new Scanner("to be or not to - be - - that - - - is");
        while (in.hasNext())
        {
            String item = in.next();
            if (!item.equals("-"))
            {
                s.push(item);
            }
            else if (!s.isEmpty())
            {
                    System.out.print(s.pop() + " ");
            }
        }
            System.out.println("(" + s.size() + " left on the stack)");
        }
}
