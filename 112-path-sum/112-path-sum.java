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
    public static boolean solve(TreeNode root,int tar,int sum){
        if(root == null) return false;
        if(root.left == null && root.right == null) return sum+root.val == tar;
        return ((root.left!=null)?(solve(root.left,tar,sum+root.val)):(false)) || ((root.right!=null)?(solve(root.right,tar,sum+root.val)):(false));
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root,targetSum,0);
    }
}