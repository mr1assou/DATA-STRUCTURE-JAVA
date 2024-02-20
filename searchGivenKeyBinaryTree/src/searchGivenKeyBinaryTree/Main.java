package searchGivenKeyBinaryTree;

public class Main {
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.insert(5);
		bt.insert(3);
		bt.insert(7);
		bt.insert(1);
		if(bt.search(0)!=null) {
			System.out.println("the number exist");
		}
		else {
			System.out.println("The number doesn't exist");
		}
	}
}
