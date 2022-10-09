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
    public static boolean search(TreeNode root,TreeNode pres,int tar){
        if(root == null) return false;
        if(root.val == tar && root != pres) return true;
        if(root.val<tar){
            return search(root.right,pres,tar);
        }
        return search(root.left,pres,tar);
    }
    public static boolean solve(TreeNode root,int k,TreeNode main){
        if(root==null) return false;
        int rem = k-root.val;
        if(search(main,root,rem)) return true;
        return solve(root.left,k,main)||solve(root.right,k,main);
        
    }
    public boolean findTarget(TreeNode root, int k) {
        return solve(root,k,root);
    }
}