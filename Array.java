import java.util.*;
//changes removed

public class Array {

    public static void main(String[] args) {

        System.out.println("hello");

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        int n = list.size();

        for (int i=0 ; i<n ;i++)
        {
            System.out.println(list.get(i));
        }
        System.out.print("\n");
        for (int e: list)
        {
            System.out.print(e +"\t");
        }
        System.out.print("\n");

        list.add(2,400);
        for (int e: list)
        {
            System.out.print(e +"\t");
        }
        System.out.print("\n");

        list.set(2,10000);
        for (int e: list)
        {
            System.out.print(e +"\t");
        }
        System.out.print("\n");

        list.remove(2);
        for (int e: list)
        {
            System.out.print(e +"\t");
        }


    }
}
