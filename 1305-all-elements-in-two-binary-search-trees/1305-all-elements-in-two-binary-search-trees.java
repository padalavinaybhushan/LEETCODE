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
    public static void traverse(TreeNode root,ArrayList<Integer> arr)
    {
        if(root != null)
        {
            traverse(root.left,arr);
            arr.add(root.val);
            traverse(root.right,arr);
        }
        
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        traverse(root1,arr1);
        traverse(root2,arr2);
        arr1.addAll(arr2);
        Collections.sort(arr1);
        return arr1;
        
    }
}