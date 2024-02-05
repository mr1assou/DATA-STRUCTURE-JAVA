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
	public void display() {
		ListNode currentNode=head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
		System.out.println("Null");
	}
	public int length(){
		int count=0;
		ListNode currentNode=head;
		while(currentNode!=null) {
			count++;
			currentNode=currentNode.next;
		}
		return count;
	}
	
}
