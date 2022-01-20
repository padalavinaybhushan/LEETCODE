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
    public static int res =0;
    public int diameterOfBinaryTree1(TreeNode root) {
        
        if(root == null)
        {
            return 0;
        }
        int lh = diameterOfBinaryTree1(root.left);
        int rh = diameterOfBinaryTree1(root.right);
       
        res = Math.max(res,rh+lh);
        
        return  1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        res=0;
        int ans = diameterOfBinaryTree1( root);
        return res;
    }
}