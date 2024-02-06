package delete_last_node;


public class Main {
	public static void main(String[] args) {
		SinglyLinkedList linkedList=new SinglyLinkedList();
		// create a nodes
		linkedList.head=new SinglyLinkedList.NodeList(10);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(11);
		SinglyLinkedList.NodeList nodeThree=new SinglyLinkedList.NodeList(35);
		// link nodes
		linkedList.head.next=nodeOne;
		nodeOne.next=nodeTwo;
		nodeTwo.next=nodeThree;
		// delete last node in singly linked list
		SinglyLinkedList.NodeList currentNode=linkedList.head;
		SinglyLinkedList.NodeList previousNode=null;
		while(currentNode.next!=null){
			previousNode=currentNode;
			currentNode=currentNode.next;
		}
		previousNode.next=null;
		//display nodes
		linkedList.display();	
	}
}

