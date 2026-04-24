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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
      Queue<TreeNode> queue = new LinkedList<>() ;
      queue.add(root);

      while(!queue.isEmpty()){
        int siz = queue.size();

        for(int i = 0 ; i < siz ; i++){
          TreeNode current = queue.poll();

          if(current.right == null && current.left == null) continue;
          if(current.left != null) queue.add(current.left);
          if(current.right != null)queue.add(current.right) ;

          TreeNode temp = current.right ;
          current.right = current.left ;
          current.left = temp ;
        }
      } 

      return root;
    }
}
