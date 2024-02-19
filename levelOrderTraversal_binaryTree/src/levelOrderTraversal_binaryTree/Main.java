package levelOrderTraversal_binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.createBinaryTree();
		Queue<BinaryTree.TreeNode> queue=new LinkedList();
		queue.offer(binaryTree.root);
		while(!queue.isEmpty()) {
			BinaryTree.TreeNode temp=queue.poll();
			System.out.println(temp.data);
			if(temp.left!=null) {
				queue.offer(temp.left);
			}
			if(temp.right!=null) {
				queue.offer(temp.right);
			}
		}
	}
}
