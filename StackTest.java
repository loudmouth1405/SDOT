
import java.util.*;
public class StackTest {

    public static void main ( String[] args)
    {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(40);
        s.push(50);

        System.out.println(s);
        

        int n = s.size();
        System.out.println(s.peek());

        System.out.println(s.isEmpty());

        System.out.println(s.search(40));
        for (int i =0 ; i<n ;i++)
        {
            
            System.out.print(s.pop() + "\t");
        }
        


    }
    
}
