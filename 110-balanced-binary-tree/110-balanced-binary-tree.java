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
    public static int isbal(TreeNode root)
    {
        if(root == null) return 0;
        int lh = isbal(root.left);
        if(lh == -1) return -1;
        int rh = isbal(root.right);
        if(rh == -1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        else
            return Math.max(rh,lh)+1;
    }
    public boolean isBalanced(TreeNode root) {
        
        return (isbal(root) == -1)?false:true;
    }
}