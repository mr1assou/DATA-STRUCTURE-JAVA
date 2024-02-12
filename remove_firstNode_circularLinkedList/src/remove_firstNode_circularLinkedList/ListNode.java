package remove_firstNode_circularLinkedList;

public class ListNode {
	public static ListNode tail;
	int data;
	public ListNode next;
	public ListNode(int data) {
		this.data=data;
	}
	public static void insert(ListNode head,ListNode nodeOne,ListNode nodeTwo) {
		nodeOne.next=nodeTwo;
		nodeTwo.next=head;
		tail=nodeTwo;
	}
	public static void insert(ListNode head) {
		head.next=head;
		tail=head;
	}
	public static void display(ListNode head) {
		int count=0;
		while(count<4) {
			System.out.println(head.data);
			head=head.next;
			count++;
		}
	}
}
