package validateBinaryTree;
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
		TreeNode first=new TreeNode(6);
		TreeNode second=new TreeNode(4);
		TreeNode third=new TreeNode(8);
		TreeNode fourth=new TreeNode(2);
		TreeNode five=new TreeNode(12);
		TreeNode sixth=new TreeNode(7);
		TreeNode seven=new TreeNode(9);
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=five;
		third.right=seven;
		third.left=sixth;
	}
	public void preOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	boolean isValid(TreeNode root,long min,long max) {
		if(root==null) {
			return true;
		}
		if(root.data<=min || root.data>=max) {
			return false;
		}
		boolean left=isValid(root.left,min,root.data);
		if(left) {
			boolean right=isValid(root.right,root.data,max);
			return right;
		}
		return false;
	}
}
