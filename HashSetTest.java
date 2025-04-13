import java.util.*;

public class HashSetTest {

    public static void main (String[] args)
    {
        HashSet<Integer> store = new HashSet<>();

        store.add(10);
        store.add(20);
        store.add(10);
        store.add(40);
        store.add(50);
        store.add(60);
        store.add(70);

        System.out.println(store);


        LinkedHashSet<Integer> store1 = new LinkedHashSet<>();

        store1.add(10);
        store1.add(20);
        store1.add(10);
        store1.add(40);
        store1.add(60);
        store1.add(50);
        store1.add(70);

        System.out.println(store1);


        TreeSet<Integer> store2 = new TreeSet<>();

       

        store2.add(10);
        store2.add(20);
        store2.add(10);
        store2.add(40);
        store2.add(60);
        store2.add(50);
        store2.add(70);
        System.out.println(store2);
        System.out.println( store2.size());

        store2.remove(70);

        System.out.println(store2);

    }

}
