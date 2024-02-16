package iterative_preorder_traversal_binary_tree;

public class Main {
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.createBinaryTree();
		bt.preOrder(bt.root);
	}
}
