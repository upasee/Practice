/*

Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
 
*/

public class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
            if(root == null) {
                return result;
            }
        postorderTraversal(root,result);
        return result;
    }
    
    public void postorderTraversal(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        }
            postorderTraversal(root.left, result);
            postorderTraversal(root.right, result);
            result.add(root.val);
    }    
}