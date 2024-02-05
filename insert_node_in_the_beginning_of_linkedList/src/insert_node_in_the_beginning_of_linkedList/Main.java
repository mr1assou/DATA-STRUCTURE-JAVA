package insert_node_in_the_beginning_of_linkedList;


public class Main {
	public static void main(String[] args) {
		SinglyLinkedList linkedList=new SinglyLinkedList();
		linkedList.head=new SinglyLinkedList.ListNode(5);
		SinglyLinkedList.ListNode newNode=new SinglyLinkedList.ListNode(7);
		linkedList.head.next=newNode;
		SinglyLinkedList.ListNode newNode2=new SinglyLinkedList.ListNode(9);
		newNode2.next=linkedList.head;
		linkedList.head=newNode2;
		SinglyLinkedList.ListNode currentNode=linkedList.head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
}
