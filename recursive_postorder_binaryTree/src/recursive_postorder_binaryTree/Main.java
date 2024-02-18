package recursive_postorder_binaryTree;

public class Main {
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.createBinaryTree();
		bt.recursivePostOrder(bt.root);
	}
}
