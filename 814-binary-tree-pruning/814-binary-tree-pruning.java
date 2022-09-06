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
    public static boolean solve(TreeNode root){
        if(root != null){
            boolean f1 = solve(root.left);
            boolean f2 = solve(root.right);
            if(f1 == false){
                root.left = null;
            }
            if(f2 == false){
                root.right = null;
            }
            if(f1||f2){
                return true;
            }
            else if(root.val == 1){
                return true;
            }
        }
        return false;
    }
    public TreeNode pruneTree(TreeNode root) {
        if(solve(root)) return root;
        return null;
    }
}