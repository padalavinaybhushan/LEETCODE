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
    public static void inorder(TreeNode root,ArrayList<Integer> arr)
    {
        if(root == null) return ;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        int len = arr.size();
        root = new TreeNode(arr.get(0));
        TreeNode prev = root;
        for(int i=1;i<len;i++)
        {
            TreeNode pres = new TreeNode(arr.get(i));
            prev.right = pres;
            prev = pres;
        }
        return root;
    }
}