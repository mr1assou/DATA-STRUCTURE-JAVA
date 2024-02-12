package implement_circularLinkedList;

public class Main {
	public static void main(String[] args) {
		// create ListNodes
				ListNode head=new ListNode(1);
				ListNode nodeOne=new ListNode(10);
				ListNode nodeTwo=new ListNode(15);
				ListNode nodeThree=new ListNode(65);
				// link nodes
				ListNode.insert(head,head, nodeOne);
				ListNode.insert(head,nodeOne,nodeTwo);
				ListNode.insert(head,nodeTwo, nodeThree);
				// logic delete node in the start and in the end;
				ListNode.display(head);
	}
}
