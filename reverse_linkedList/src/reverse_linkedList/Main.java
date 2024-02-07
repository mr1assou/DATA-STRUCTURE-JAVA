package reverse_linkedList;

public class Main {
	public static void main(String[] args) {

		// create a nodes
		SinglyLinkedList.NodeList head=new SinglyLinkedList.NodeList(10);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(8);
		SinglyLinkedList.NodeList nodeThree=new SinglyLinkedList.NodeList(11);
		// link nodes
		head.next=nodeOne;
		nodeOne.next=nodeTwo;
		nodeTwo.next=nodeThree;
		// show regular linked list
		System.out.println("regular linked list:");
		SinglyLinkedList.display(head);
		//logic of reverse linked list
		SinglyLinkedList.NodeList currentNode=head;
		SinglyLinkedList.NodeList next=null;
		SinglyLinkedList.NodeList previous=null;
		while(currentNode!=null) {
			next=currentNode.next;
			currentNode.next=previous;
			previous=currentNode;
			currentNode=next;
		}
		// show reversed linked list
		System.out.println("reversed linked list:");
		SinglyLinkedList.display(previous);
	}
}
