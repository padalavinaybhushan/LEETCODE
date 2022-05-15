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
    public void depth(TreeNode root,int dep,HashMap<Integer,ArrayList<TreeNode>> hm)
    {
        if(root == null) return;
        
        if(hm.containsKey(dep))
        {
            ArrayList<TreeNode> arr = hm.get(dep);
            arr.add(root);
            hm.put(dep,arr);
        }
        else 
        {
            ArrayList<TreeNode> arr = new ArrayList<>();
            arr.add(root);
            hm.put(dep,arr);
        }
        depth(root.left,dep+1,hm);
        depth(root.right,dep+1,hm);
    }
    public int deepestLeavesSum(TreeNode root) {
        HashMap<Integer,ArrayList<TreeNode>> hm = new HashMap<>();
        depth(root,0,hm);
        int max = Collections.max(hm.keySet());
        ArrayList<TreeNode>  arr = hm.get(max);
        int ans=0;
        for(TreeNode tem : arr)
        {
            ans+=tem.val;
        }
        return ans;
    }
}