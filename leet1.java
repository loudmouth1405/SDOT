import java.util.Arrays;
import java.util.Stack;

public class leet1 {
    private static int[] findNextSmallerElementIndex(int[] heights) {
            int n = heights.length;
            Stack<Integer> stack = new Stack<>();
            int[] result = new int[n];
            Arrays.fill(result, n);
    
            for (int index = n - 1; index >= 0; index--) {
                while (stack.size() > 0 && heights[stack.peek()] >= heights[index]) {
                    stack.pop();
                }
    
                if (stack.size() > 0) {
                    result[index] = stack.peek();
                }
                stack.push(index);
            }
            return result;
        }
    
        private static int[] findPreviousSmallerElementIndex(int[] heights) {
                int n = heights.length;
                Stack<Integer> stack = new Stack<>();
                int[] result = new int[n];
                Arrays.fill(result, -1);
        
                for (int index = 0; index < n; index++) {
                    while (stack.size() > 0 && heights[stack.peek()] >= heights[index]) {
                        stack.pop();
                    }
        
                    if (stack.size() > 0) {
                        result[index] = stack.peek();
                    }
                    stack.push(index);
                }
                return result;
            }
            public static int largestRectangleArea(int[] heights) {
                    int n = heights.length;
                    int result = 0;
            
            
                    int[] nextSmallerElement = findNextSmallerElementIndex(heights);
                int[] leftSmallerElement = findPreviousSmallerElementIndex(heights);
            
    
            for (int index = 0; index < n; index++) {
                int width = 1;
    
                int rightPillarsContribution = nextSmallerElement[index] - index - 1;
                int leftPillarsContribution = index - leftSmallerElement[index] - 1;
    
                width += rightPillarsContribution;
                width += leftPillarsContribution;
                
                int currentArea = heights[index] * width;
                result = Math.max(result, currentArea);
    
            }
    
            return result;
        }
       public static void main(String[] args)
       {
    
        int heights[]={2,1,5,6,2,3};
    
       
       int max= largestRectangleArea(heights);

       System.out.println(max);

    


 
}

}
