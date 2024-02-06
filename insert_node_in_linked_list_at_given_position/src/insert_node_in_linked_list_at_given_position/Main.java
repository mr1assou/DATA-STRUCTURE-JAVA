package insert_node_in_linked_list_at_given_position;


public class Main {
	public static void main(String[] args) {
		SinglyLinkedList linkedList=new SinglyLinkedList();
		// create a nodes
		linkedList.head=new SinglyLinkedList.NodeList(8);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(10);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(1);
		// link nodes
		linkedList.head.next=nodeOne;
		nodeOne.next=nodeTwo;
		// add node in a given position
		SinglyLinkedList.NodeList newNode=new SinglyLinkedList.NodeList(7);
		int position=2;
		if(position==1) {
			newNode.next=linkedList.head;
			linkedList.head=newNode;
		}
		else {
			int count=1;
			SinglyLinkedList.NodeList previousNode=linkedList.head;
			// catch previous node
			while(count<position-1) {
				previousNode=previousNode.next;
				count++;
			}
			// third Node
			SinglyLinkedList.NodeList nextNode=previousNode.next;
			newNode.next=nextNode;
			previousNode.next=newNode;
		}
		//display nodes
		SinglyLinkedList.NodeList currentNode=linkedList.head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
}
