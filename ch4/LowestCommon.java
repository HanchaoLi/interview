package ch4;
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val) {
		this.val = val;
	}
}
public class LowestCommon {
//leetcode 285
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode leftp = lowestCommonAncestor(root.left, p, q);
        TreeNode rightp = lowestCommonAncestor(root.right, p, q);
        if (leftp == null) {
            return rightp;
        }
        if (rightp == null) {
            return leftp;
        }
        return root;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(0);
		TreeNode node6 = new TreeNode(8);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(4);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.left = node4;
		node2.left = node5;
		node2.right = node6;
		node4.left = node7;
		node4.right = node8;
		lowestCommonAncestor(root, node1, node8);
	}
}
