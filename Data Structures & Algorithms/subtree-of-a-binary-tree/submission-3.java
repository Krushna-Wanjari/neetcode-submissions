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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        if(root != null && subRoot == null) return true;
        if(root == null && subRoot != null) return false;

       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);

       while(!q.isEmpty()){
          int siz = q.size();

          for(int i = 0 ; i < siz ; i++){
            TreeNode node = q.poll();
            if(node.val == subRoot.val && check(node , subRoot)) return true;

            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right) ;
          }
       }
       return false;
    }

    public boolean check(TreeNode root1 , TreeNode root2){
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(root1);
        q2.add(root2);

        while(!q1.isEmpty() && !q2.isEmpty()){
            int siz1 = q1.size();
            int siz2 = q2.size();

            if(siz1 != siz2) return false;

            for(int i = 0 ; i < siz1 ; i++){
                TreeNode s1 = q1.poll();
                TreeNode s2 = q2.poll();

                if(s1.val != s2.val) return false;

                if(s1.left == null && s2.left != null) return false;
                if(s1.right == null && s2.right != null) return false;
                if(s2.left == null && s1.left != null) return false;
                if(s2.right == null && s1.right != null) return false;

                if(s1.left != null){
                    q1.add(s1.left);
                    q2.add(s2.left);
                }

                if(s2.right != null){
                    q1.add(s1.right);
                    q2.add(s2.right);
                }
            }

        }
        return q1.isEmpty() && q2.isEmpty();
    }
}
