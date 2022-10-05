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
    public static void solve(TreeNode root,int val,int depth,int curr){
        if(root == null) return;
        if(curr == depth-1){
            TreeNode tem1 = root.left;
            TreeNode tem2 = root.right;
            TreeNode n1 = new TreeNode(val,tem1,null);
            TreeNode n2 = new TreeNode(val,null,tem2);
            root.left = n1;
            root.right = n2;
            
        }
        else{
            solve(root.left,val,depth,curr+1);
            solve(root.right,val,depth,curr+1);
        }
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
           TreeNode new_root = new TreeNode(val);
            new_root.left = root;
            new_root.right = null;TreeNode r = new TreeNode(1,root,null);
            return new_root;
        }
        solve(root,val,depth,1);
        return root;
    }
}