/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> a = new LinkedList<List<Integer>>();

        if (root==null)
        {
            return a;
        }
        Queue<TreeNode> queue = new LinkedList<> ();
        queue.add(root);
        
        
        while(!queue.isEmpty())
        { 
            List<Integer> s = new ArrayList<>();
            int n= queue.size();

            for(int i =0 ;i<n;i++)
            {
                TreeNode cur = queue.peek();
                queue.poll();
                   s.add(cur.val);
                   if(cur.right != null)
                   queue.add(cur.right);
                if(cur.left != null)
                  queue.add(cur.left);
             
              
            }

            a.add(s);

             n= queue.size();
             s = new ArrayList<>();
             
            if(!queue.isEmpty())
            {
                 for(int i =0 ;i<n;i++)
            {
                
               
                TreeNode cur = queue.peek();
                queue.poll();
                   s.add(cur.val);
              
             
                if(cur.left != null)
                  queue.add(cur.left);   
                  if(cur.right != null)
                   queue.add(cur.right);  
              
            }
             a.add(s);
            }

        
 
        }

          return a;
        

    }
}
