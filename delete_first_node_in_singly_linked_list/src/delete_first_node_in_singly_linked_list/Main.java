package delete_first_node_in_singly_linked_list;


public class Main {
	public static void main(String[] args) {
		SinglyLinkedList linkedList=new SinglyLinkedList();
		// create a nodes
		linkedList.head=new SinglyLinkedList.NodeList(10);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(11);
		// link nodes
		linkedList.head.next=nodeOne;
		nodeOne.next=nodeTwo;
		// delete first node by set .next to null
		SinglyLinkedList.NodeList tmp=linkedList.head;
		linkedList.head=linkedList.head.next;
		tmp.next=null;
		//display nodes
		linkedList.display();	
	}
}
