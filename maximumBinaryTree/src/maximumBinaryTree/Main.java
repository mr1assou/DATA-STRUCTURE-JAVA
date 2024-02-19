package maximumBinaryTree;

public class Main {
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.createBinaryTree();
		System.out.println(bt.maximumBinaryTree(bt.root));
	}
}
