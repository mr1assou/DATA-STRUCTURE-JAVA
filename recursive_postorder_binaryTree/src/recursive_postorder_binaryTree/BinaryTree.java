package recursive_postorder_binaryTree;

import java.util.Stack;

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
	public void iterativePreorder() {
		Stack<BinaryTree.TreeNode> stack=new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode temp=stack.pop();
			System.out.println(temp.data);
			if(temp.right!=null) {
				stack.push(temp.right);
			}
			if(temp.left!=null) {
				stack.push(temp.left);
			}
		}
	}
	public void recursiveInorderTraversal(TreeNode root) {
		if(root.left!=null) {
			recursiveInorderTraversal(root.left);
		}
		System.out.println(root.data);
		if(root.right!=null) {
			recursiveInorderTraversal(root.right);
		}
	}
	public static void recursivePostOrder(TreeNode root) {
		if(root.left!=null) {
			recursivePostOrder(root.left);
		}
		if(root.right!=null) {
			recursivePostOrder(root.right);
		}
		System.out.println(root.data);
	}
}
