/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> que = new LinkedList<>();
        if(root == null) return null;
        que.add(root);
        List<List<Node>> lot = new ArrayList<>();
        while(!que.isEmpty())
        {
            List<Node> tem = new ArrayList<>();
            int size = que.size();
            for(int i=0;i<size;i++)
            {
                if(que.peek().left != null) que.add(que.peek().left);
                if(que.peek().right != null) que.add(que.peek().right);
                tem.add(que.poll());
            }
            lot.add(tem);
        }
        int n = lot.size();
        for(int i=1;i<n;i++)
        {
            int size = lot.get(i).size();
            for(int j=0;j<size-1;j++)
            {
                lot.get(i).get(j).next = lot.get(i).get(j+1);
            }
        }
        return root;
    }
}