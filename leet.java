import java.util.*;


public class leet {

    public static void main(String[] args) {
        {

       
    }

   int heights[]={2,1,5,6,2,3};
    

    int result;

        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList();
    

        int n = heights.length;
       

        int[] qsum = new int[n];
       /*  int j=-1;
        int l=0;*/

int max;
        for(int j=heights.length-1; j>=0 ; j--)
            {
                while(!s.isEmpty() && heights[s.peek()]>heights[j])
                {
                    max=heights[s.peek()]*s.size();
                    s.pop();
                    System.out.println(max);
                }

             s.push(heights.length-1);
        
            }
            
        

        /*for(int i = 0 ; i <heights.length  ; i++)
        {
            
            while (!q.isEmpty() && heights[q.peek()]>heights[i] )
            {
               System.out.println(q.size());
               System.out.println(heights[q.peek()]);
                qsum[l]=q.size()*heights[q.peek()];
                q.poll();
                
                l+=1;
                
                
            }
          
            if(!q.isEmpty())
            {

            }
            q.add(j+=1);
            System.out.println(q);
        }
        System.out.println(Arrays.toString(qsum));*/

        
    }
}
