package levelOrderTraversal_binaryTree;

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
		TreeNode first=new TreeNode(1);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		TreeNode fifth=new TreeNode(5);
		TreeNode sixth=new TreeNode(6);
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=fifth;
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
}
