package find_middle_node_in_linked_list;

public class Main {
	public static void main(String[] args) {
		// create a nodes
		SinglyLinkedList.NodeList head=new SinglyLinkedList.NodeList(10);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(8);
		SinglyLinkedList.NodeList nodeThree=new SinglyLinkedList.NodeList(11);
		SinglyLinkedList.NodeList nodeFour=new SinglyLinkedList.NodeList(11);
		// link nodes
		head.next=nodeOne;
		nodeOne.next=nodeTwo;
		nodeTwo.next=nodeThree;
		nodeThree.next=nodeFour;
		//logic of reverse linked list
		SinglyLinkedList.NodeList slowPtr=head;
		SinglyLinkedList.NodeList fastPtr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		System.out.println(slowPtr.data);
		// show reversed linked list
		//SinglyLinkedList.display(head);
	}
}
