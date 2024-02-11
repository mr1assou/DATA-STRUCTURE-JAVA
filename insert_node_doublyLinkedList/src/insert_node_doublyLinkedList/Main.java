package insert_node_doublyLinkedList;

public class Main {
	public static void main (String[] args) {
		// create ListNodes
		ListNode head=new ListNode(1);
		ListNode nodeOne=new ListNode(10);
		ListNode nodeTwo=new ListNode(15);
		ListNode nodeThree=new ListNode(65);
		ListNode newNode=new ListNode(23);
		// link nodes
		ListNode.insert(head, nodeOne);
		ListNode.insert(nodeOne,nodeTwo);
		ListNode.insert(nodeTwo, nodeThree);
		// login insert node in the beginning
		head.prev=newNode;
		newNode.next=head;
		head=newNode;
		ListNode.display(head);
	}
}
