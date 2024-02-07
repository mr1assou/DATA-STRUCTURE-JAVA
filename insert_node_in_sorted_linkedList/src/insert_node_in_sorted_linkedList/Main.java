package insert_node_in_sorted_linkedList;

public class Main {
	public static void main(String[] args) {
		// create a nodes
		SinglyLinkedList.NodeList head=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(8);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(10);
		SinglyLinkedList.NodeList nodeThree=new SinglyLinkedList.NodeList(16);
		// link nodes
		head.next=nodeOne;
		nodeOne.next=nodeTwo;
		nodeTwo.next=nodeThree;
		//logic of insert a node in a sorted linkedList
		SinglyLinkedList.NodeList newNode=new SinglyLinkedList.NodeList(10);
		SinglyLinkedList.NodeList current=head;
		SinglyLinkedList.NodeList temp=null;
		if(newNode.data<=head.data) {
			newNode.next=head;
			head=newNode;
		}
		else {
			while(current!=null && current.data<newNode.data) {
				temp=current;
				current=current.next;
			}
			newNode.next=current;
			temp.next=newNode;
		}
		// show reversed linked list
		SinglyLinkedList.display(head);
	}
}