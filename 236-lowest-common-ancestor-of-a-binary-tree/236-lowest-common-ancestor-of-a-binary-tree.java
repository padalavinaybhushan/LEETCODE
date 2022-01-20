/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode fun(TreeNode root,int n1,int n2)
    {
        if(root == null ) return null;
        if(root.val == n1|| root.val == n2)
        {
            return root;
        }
        TreeNode lca1 = fun(root.left,n1,n2);
        TreeNode lca2 = fun(root.right,n1,n2);
        if(lca1 != null && lca2 != null)
        {
            return root;
        }
        if(lca1 != null)
        {
            return lca1;
        }
        else
        {
            return lca2;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        return fun(root,p.val,q.val);
    }
}