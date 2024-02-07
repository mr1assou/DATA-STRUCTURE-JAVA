package insert_node_in_sorted_linkedList;

import insert_node_in_sorted_linkedList.SinglyLinkedList.NodeList;

public class Main {
	public static void main(String[] args) {
		// create a nodes
		SinglyLinkedList.NodeList head=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(2);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(3);
		SinglyLinkedList.NodeList nodeThree=new SinglyLinkedList.NodeList(5);
		SinglyLinkedList.NodeList nodeFour=new SinglyLinkedList.NodeList(6);
		// link nodes
		head.next=nodeOne;
		nodeOne.next=nodeTwo;
		nodeTwo.next=nodeThree;
		nodeThree.next=nodeFour;
		//logic of insert a node in a sorted linkedList
		SinglyLinkedList.NodeList newNode=new SinglyLinkedList.NodeList(4);
		NodeList current=head;
		while(current!=null) {
			if(current.data<newNode.data && current.next.data>newNode.data) {
				newNode.next=current.next;
				current.next=newNode;
			}
			current=current.next;
		}
		// show reversed linked list
		SinglyLinkedList.display(head);
	}
}