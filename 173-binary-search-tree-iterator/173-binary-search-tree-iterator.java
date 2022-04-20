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
class BSTIterator {
    TreeNode root ;
    ArrayList<Integer> arr;
    int count;
    int size;
    boolean flag;
    public void inorder(TreeNode root,ArrayList<Integer> arr)
    {
        if(root == null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public BSTIterator(TreeNode root) {
        this.root = root;
        arr = new ArrayList<Integer>();
        count=0;
        inorder(root,arr);
        size = arr.size();
        System.out.println(arr);
        if(root == null) flag = false;
        flag = true;
        
    }
    
    public int next() {
        return arr.get(count++);
    }
    
    public boolean hasNext() {
        if(size <= count) return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */