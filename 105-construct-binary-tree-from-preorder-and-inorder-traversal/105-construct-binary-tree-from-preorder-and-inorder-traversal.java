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
    int preind =0;
    HashMap<Integer,Integer> hm;
    public TreeNode ctree(int[] in,int[] pre,int is,int ie)
    {
        if(is>ie) return null;
        TreeNode root = new TreeNode(pre[preind++]);
        int index=0;
        // for(int i=is;i<=ie;i++)
        // {
        //     if(in[i] == root.val)
        //     {
        //         index = i;
        //         break;
        //     }
        // }
        index = hm.get(root.val);
        root.left = ctree(in,pre,is,index-1);
        root.right = ctree(in,pre,index+1,ie);
        return root;
    }
    public TreeNode buildTree(int[] pre, int[] in) {
        hm = new HashMap<>();
        int len = in.length;
        for(int i=0;i<len;i++)
        {
            hm.put(in[i],i);
        }
        return ctree(in,pre,0,pre.length-1);
    }
}