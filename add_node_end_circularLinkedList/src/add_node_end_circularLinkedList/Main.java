package add_node_end_circularLinkedList;

public class Main {
	public static void main(String[] args) {
		// create ListNodes
				ListNode head=new ListNode(1);
				ListNode nodeOne=new ListNode(8);
				ListNode nodeTwo=new ListNode(10);
				ListNode nodeThree=new ListNode(16);
				// link nodes
				ListNode.insert(head,head, nodeOne);
				ListNode.insert(head,nodeOne,nodeTwo);
				ListNode.insert(head,nodeTwo, nodeThree);
				// logic add new Node in the end 
				ListNode newNode=new ListNode(24);
				ListNode.tail.next=newNode;
				newNode.next=head;
				ListNode.display(head);
	}
}
