package singly_linked_list;

public class SinglyLinkedList {
	public ListNode head;
	public static class ListNode{
		public int data; // can be generic type 
		public ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		} 
	}
	
}
