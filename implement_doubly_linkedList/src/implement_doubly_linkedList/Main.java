package implement_doubly_linkedList;

public class Main {
	public static void main (String[] args) {
		// create ListNodes
		ListNode head=new ListNode(1);
		ListNode nodeOne=new ListNode(10);
		ListNode nodeTwo=new ListNode(15);
		ListNode nodeThree=new ListNode(65);
		// link nodes
		ListNode.insert(head, nodeOne);
		ListNode.insert(nodeOne,nodeTwo);
		ListNode.insert(nodeTwo, nodeThree);
		ListNode.display(head);
	}
}
