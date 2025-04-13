
import java.util.HashMap;

public class HashMapTest {

public static void main(String [] args)
{
    HashMap<Integer, String> store = new HashMap<>();

    store.put(1,"sudhar1");
    store.put(2,"sudhar2");
    store.put(3,"sudhar3");
    store.put(4,"sudhar4");
    store.put(5,"sudhar5");

    System.out.println(store);
    store.keySet();

    System.out.println(store.get(5));
    System.out.println(store.getOrDefault(6, "Mass"));
    if(store.containsKey(1))
    {
        System.out.println("available");
    }
    else{
        System.out.println("Not available");

    }

    System.out.println(store.containsKey(1));

    for(int key : store.keySet())
    {
        System.out.println(key + "-->" + store.get(key));
    }

}
   
    
}
