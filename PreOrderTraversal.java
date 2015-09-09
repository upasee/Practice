/*

Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
 
*/

public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
            if(root == null) {
                return result;
            }
        preorderTraversal(root,result);
        return result;
    }
    
    public void preorderTraversal(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        }
            result.add(root.val);
            preorderTraversal(root.left, result);
            preorderTraversal(root.right, result);
    }    
}