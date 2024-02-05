package insert_node_end_of_linkedList;

public class Main {
	public static void main(String[] args) {
		SinglyLinkedList linkedList=new SinglyLinkedList();
		// create a nodes
		linkedList.head=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(2);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(3);
		SinglyLinkedList.NodeList nodeThree=new SinglyLinkedList.NodeList(4);
		SinglyLinkedList.NodeList nodeFour=new SinglyLinkedList.NodeList(5);
		SinglyLinkedList.NodeList nodeFive=new SinglyLinkedList.NodeList(6);
		// link nodes
		linkedList.head.next=nodeOne;
		nodeOne.next=nodeTwo;
		nodeTwo.next=nodeThree;
		nodeThree.next=nodeFour;
		SinglyLinkedList.NodeList currentNode=linkedList.head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
		nodeFour.next=nodeFive;
		currentNode=linkedList.head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
}
