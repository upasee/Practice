/*

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { 
		val = x; 
	}

*/

public class KthSmallestElement {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> sorted = new ArrayList<Integer>();
        helper(root, sorted);
        return sorted.get(k-1);
    }
    
    public void helper(TreeNode root, List<Integer> result) {
        if(root == null)
		return;
    
	helper(root.left,result);
        result.add(root.val);
        helper(root.right,result);
    }

}
