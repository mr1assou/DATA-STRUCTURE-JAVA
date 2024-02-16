package recursive_inorder_traversal_binaryTree;

import recursive_inorder_traversal_binaryTree.BinaryTree.TreeNode;

public class Main {
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.createBinaryTree();
		bt.recursiveInorderTraversal(bt.root);
	}
}
