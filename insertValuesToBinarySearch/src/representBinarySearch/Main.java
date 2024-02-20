package representBinarySearch;

public class Main {
	public static void main(String[] args) {
		BinarySearchTree bt=new BinarySearchTree();
		bt.insert(5);
		bt.insert(3);
		bt.insert(7);
		bt.insert(1);
		bt.inOrder();
	}
}
