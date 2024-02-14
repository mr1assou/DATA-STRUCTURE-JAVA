package binary_tree;

public class Main {
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.createBinaryTree();
		bt.preOrder(bt.root);
	}
}
