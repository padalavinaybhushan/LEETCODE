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
    int count=0;
    public  void inorder(TreeNode root,ArrayList<Integer> arr)
    {
        if(root == null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public void fun(TreeNode root,ArrayList<Integer> arr)
    {
        if(root == null ) return;
        fun(root.left,arr);
        int ind = count;
        root.val = arr.get(ind);
        count++;
        fun(root.right,arr);
        
    }
    public TreeNode bstToGst(TreeNode root) {
      ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        int size = arr.size();
        for(int i = size-2;i>=0;i--)
        {
            arr.set(i,arr.get(i)+arr.get(i+1));
        }
        count=0;
        fun(root,arr);
        return root;
    }
}