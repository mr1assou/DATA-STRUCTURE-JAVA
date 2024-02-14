package binary_tree;

public class BinaryTree {
	public TreeNode root;
	public class TreeNode{
		TreeNode left;
		TreeNode right;
		int data;
		public TreeNode(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public void createBinaryTree() {
		TreeNode first=new TreeNode(9);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
	}
	public void preOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
}	
