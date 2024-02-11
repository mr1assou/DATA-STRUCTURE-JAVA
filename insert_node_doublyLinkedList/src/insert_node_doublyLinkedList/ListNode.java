package insert_node_doublyLinkedList;

public class ListNode {
	int data;
	public ListNode prev;
	public ListNode next;
	public ListNode(int data) {
		this.data=data;
	}
	public static void insert(ListNode nodeOne,ListNode nodeTwo) {
		nodeOne.next=nodeTwo;
		nodeTwo.prev=nodeOne;
	}
	public static void display(ListNode head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}