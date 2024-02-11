package implement_doubly_linkedList;

public class ListNode {
	int data;
	public ListNode prev;
	public ListNode next;
	public ListNode(int data) {
		this.data=data;
	}
	public static void display(ListNode head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}
