package representBinarySearch;

public class BinarySearchTree {
	public TreeNode root;
	public class TreeNode{
		public int data;
		public TreeNode right;
		public TreeNode left;
		public TreeNode(int data) {
			this.data=data;
		}
	}
	public void insert(int value) {
		root=insert(root,value);
	}
	public TreeNode insert(TreeNode root,int value) {
		if(root==null) {
			root=new TreeNode(value);
			return root;
		}
		if(value<root.data) {
			root.left=insert(root.left,value);
		}
		else {
			root.right=insert(root.right,value);
		}
		return root;
	}
	public void inOrder() {
		 inOrder(root);
	}
	public void inOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		inOrder(root.left);
		inOrder(root.right);
	}
}
