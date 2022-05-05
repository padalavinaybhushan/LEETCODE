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
    static int count=0;
    public static void inorder(TreeNode root)
    {
        if(root == null ) return ;
        count++;
        inorder(root.left);
        inorder(root.right);
    }
    public int countNodes(TreeNode root) {
        count=0;
        inorder(root);
        return count;
    }
}