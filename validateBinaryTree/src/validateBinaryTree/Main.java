package validateBinaryTree;

public class Main {
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.createBinaryTree();
		System.out.println(bt.isValid(bt.root,Long.MIN_VALUE,Long.MAX_VALUE));
	}
}
