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
import java.text.DecimalFormat.*;
class Solution {
    public static void solve(TreeNode root,int depth,HashMap<Integer,Long> hm,HashMap<Integer,Integer> count){
        if(root == null) return;
        hm.put(depth,hm.getOrDefault(depth,(long)0)+root.val);
        count.put(depth,count.getOrDefault(depth,0)+1);
        solve(root.left,depth+1,hm,count);
        solve(root.right,depth+1,hm,count);
    }
    public List<Double> averageOfLevels(TreeNode root) {
        HashMap<Integer,Long> hm = new HashMap<>();
        HashMap<Integer,Integer> count = new HashMap<>();
        solve(root,0,hm,count);
        List<Double> arr = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("###.#####");
        int i=0;
        while(hm.containsKey(i)){
            arr.add(Double.parseDouble(df.format(hm.get(i)/(1.0*count.get(i)))));
            i++;
        }
        return arr;
    }
}