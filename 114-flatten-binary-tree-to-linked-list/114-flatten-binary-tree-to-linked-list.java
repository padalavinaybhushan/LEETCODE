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
    public void flatten(TreeNode root) {
        TreeNode p=root,q;
        while(p!=null){
            q=p.left;
            if(q!=null){
                while(q.right!=null)
                    q=q.right;
                q.right=p.right;
                p.right=p.left;
                p.left=null;
            }
            p=p.right;
        }
    }
}