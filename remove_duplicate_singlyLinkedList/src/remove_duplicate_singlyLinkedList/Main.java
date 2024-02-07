package remove_duplicate_singlyLinkedList;

public class Main {
	public static void main(String[] args) {
		// create a nodes
		SinglyLinkedList.NodeList head=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(2);
		SinglyLinkedList.NodeList nodeThree=new SinglyLinkedList.NodeList(3);
		SinglyLinkedList.NodeList nodeFour=new SinglyLinkedList.NodeList(3);
		// link nodes
		head.next=nodeOne;
		nodeOne.next=nodeTwo;
		nodeTwo.next=nodeThree;
		nodeThree.next=nodeFour;
		//logic of delete duplicate in singly linked list
		SinglyLinkedList.NodeList current=head;
		while(current!=null && current.next!=null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}
			else {
				current=current.next;
			}
		}
		// show reversed linked list
		SinglyLinkedList.display(head);
	}
}
