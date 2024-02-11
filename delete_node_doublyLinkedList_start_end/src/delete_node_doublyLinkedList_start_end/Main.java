package delete_node_doublyLinkedList_start_end;
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
		// logic delete node in the start and in the end
		head=ListNode.removeInThebeginning(head);
		ListNode.removeInTheEnd();
		ListNode.display(head);
	}
}
