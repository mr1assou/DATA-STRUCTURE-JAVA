package delete_node_given_position;


public class Main {
	public static void main(String[] args) {
		SinglyLinkedList linkedList=new SinglyLinkedList();
		// create a nodes
		linkedList.head=new SinglyLinkedList.NodeList(10);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeThree=new SinglyLinkedList.NodeList(11);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(8);
		// link nodes
		linkedList.head.next=nodeOne;
		nodeOne.next=nodeTwo;
		nodeTwo.next=nodeThree;
		//logic if delete nodes in specific position
		int position=2;
		if(position==1) {
			linkedList.head=linkedList.head.next;
		}
		else {
			// here in this logic keep in mind Garbage collector
			SinglyLinkedList.NodeList previousNode=linkedList.head;
			int count=1;
			while(count<position-1){
				previousNode=previousNode.next;
				count++;
			}
			SinglyLinkedList.NodeList currentNode=previousNode.next;
			previousNode.next=currentNode.next;
		}
		// display nodes
		linkedList.display();
	}
}
