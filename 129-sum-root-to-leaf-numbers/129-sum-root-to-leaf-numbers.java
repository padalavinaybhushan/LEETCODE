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
    public static int fun(TreeNode root,StringBuilder str){
        if(root == null) return Integer.parseInt(str.toString());
        StringBuilder rot = new StringBuilder(str);
        rot.append(Integer.toString(root.val));
        int left=0,right=0;
        //System.out.println(rot);
        if(root.left==null && root.right == null) return Integer.parseInt(rot.toString());
        if(root.left != null) {
            left=fun(root.left,rot);
        }
        if(root.right != null) right = fun(root.right,rot);
        //System.out.println(left+right);
        return left+right;
    }
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        return fun(root,new StringBuilder("0"));
        
    }
}