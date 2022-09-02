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
    static int count = 0;
    public static void solve(TreeNode root,int max){
        if(root == null ) return;
        if(max <= root.val){
            count++;
        }
        max = Math.max(root.val, max);
        solve(root.left,max);
        solve(root.right,max);
    }
    public int goodNodes(TreeNode root) {
        count=0;
        solve(root,Integer.MIN_VALUE);
        return count;
    }
}