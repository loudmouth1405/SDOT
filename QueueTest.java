import java.util.*;

public class QueueTest {
  

    public static void main(String[] args)
    {
        Queue<Integer> Q = new LinkedList<>();

        Q.add(10);
        Q.add(20);
        Q.add(30);
        Q.add(40);
        Q.add(50);
    
        System.out.println(Q);
        System.out.println(Q.peek());

        System.out.println(Q.isEmpty());


        int n = Q.size();

        for (int i =0 ; i<n ;i++)
        {
            System.out.print(Q.poll() + "\t");
        }
        

    }
   
    
}
