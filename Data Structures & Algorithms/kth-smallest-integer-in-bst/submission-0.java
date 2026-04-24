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
    public int kthSmallest(TreeNode root, int k) {
      Queue<TreeNode> queue = new LinkedList<>() ;
      queue.add(root);

      Queue<Integer> data = new PriorityQueue<>() ;

      while(!queue.isEmpty()){
        int siz = queue.size();

        for(int i = 0 ; i < siz ; i++){
            TreeNode node = queue.poll();
            data.add(node.val);

            if(node.left != null)queue.add(node.left);
            if(node.right != null)queue.add(node.right);
        }
      }

      int out = 0;
      while(k!= 0){
        out = data.poll();
        k--;
      }
      return out;
       
    }
}
