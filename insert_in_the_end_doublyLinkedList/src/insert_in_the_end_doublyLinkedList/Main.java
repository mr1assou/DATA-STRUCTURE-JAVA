package insert_in_the_end_doublyLinkedList;

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
		// login insert node in the end of singlyLinkedList
		ListNode newNode=new ListNode(23);
		ListNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.prev=temp;
		ListNode.display(head);
	}
}
