package itertive_preloader_binaryTree;

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
		TreeNode five=new TreeNode(7);
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=five;
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
		TreeNode temp=root;
		Stack<TreeNode> stack=new Stack<>();
		while(!stack.isEmpty() || temp!=null) {
			if(temp!=null) {
				System.out.println(temp.data);
				stack.push(temp);
				temp=temp.left;
			}
			else {
				temp=stack.pop();
				temp=temp.right;
			}
		}
	}
}
