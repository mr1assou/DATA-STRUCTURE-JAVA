package twoSortedLinkedList;

public class LinkedList {
	ListNode head;
	public static class ListNode{
		int data;
		ListNode next;
		public ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void display() {
		LinkedList.ListNode currentNode=head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
}
