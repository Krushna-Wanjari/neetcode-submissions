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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root); 
       int count = 0;

       while(!queue.isEmpty()){
        count++;
        int siz = queue.size();

        for(int i = 0 ; i < siz ; i++){
            TreeNode current = queue.poll();
            if(current.right != null) queue.add(current.right);
            if(current.left != null) queue.add(current.left);
        }

       }
       return count ;
    }
}
