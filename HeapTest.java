import java.util.*;


public class HeapTest {


    public static void main(String[] args)
    {
       PriorityQueue<Integer> H = new PriorityQueue<>();
       

    H.add(10);
    H.add(30);
    H.add(20);
    H.add(60);
    H.add(80);
    H.add(50);
    H.add(70);
    
    System.out.println(H);
    System.out.println(H.peek());

    System.out.println(H.poll());
    System.out.println(H.poll());
    System.out.println(H.poll());
    System.out.println(H.poll());
    H.remove(70);     

    }
}
