package singly_linked_list;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		SinglyLinkedList linkedList=new SinglyLinkedList();
		// create nodes and keep in mind they point to null	
		linkedList.head=new SinglyLinkedList.ListNode(10);
		SinglyLinkedList.ListNode second=new SinglyLinkedList.ListNode(20);
		SinglyLinkedList.ListNode third=new SinglyLinkedList.ListNode(30);
		SinglyLinkedList.ListNode four=new SinglyLinkedList.ListNode(40);
		// Now we will connect them together
		linkedList.head.next=second; //10 --->20
		second.next=third; //20 --->30
		third.next=four; //30 --->40-->null
		// display linkedList		
		SinglyLinkedList.ListNode currentNode=linkedList.head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
		System.out.println("Null");
	}
}
