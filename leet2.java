public class leet2 {

    //{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            // Convert ArrayList to array
            Integer[] arr = new Integer[array.size()];
            array.toArray(arr);

            Solution ob = new Solution();

            // Call totalFruits method and print result
            Integer ans = ob.totalElements(arr);
            System.out.println(ans);

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int unique(Integer []arr ,int SIndex ,int EIndex)
    {
        HashSet<Integer> h=new HashSet<>();
        
    for (int i =SIndex ; i<EIndex ;i++)
    {
        h.add(arr[i]);
    }
    
    return h.size();
    }
    
    public static int totalElements(Integer [] arr) {
        
        int n=arr.length-1;
        int R=0;
        int L=1;
        int max=0;
        while(n>R)
        {
            if(unique(arr,R,L)<=2)
            {
               if(max< L-R)
               {
                   max=L-R;
               }
            }
        }
        
        return max;
        
    }

    
}


