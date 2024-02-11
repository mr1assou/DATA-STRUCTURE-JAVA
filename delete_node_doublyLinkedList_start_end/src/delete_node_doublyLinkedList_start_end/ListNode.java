package delete_node_doublyLinkedList_start_end;
public class ListNode {
	public static ListNode tail;
	int data;
	public ListNode prev;
	public ListNode next;
	public ListNode(int data) {
		this.data=data;
	}
	public static void insert(ListNode nodeOne,ListNode nodeTwo) {
		nodeOne.next=nodeTwo;
		nodeTwo.prev=nodeOne;
		tail=nodeTwo;
	}
	public static void display(ListNode head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	public static ListNode removeInThebeginning(ListNode head){
		head=head.next;
		head.prev=null;
		return head;
	}
	public static void removeInTheEnd(){
		tail=tail.prev;
		tail.next=null;
	}
}
