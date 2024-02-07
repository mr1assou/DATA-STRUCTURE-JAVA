package nth_node_from_end_of_linkedList;

public class Main {
	public static void main(String[] args) {
		SinglyLinkedList linkedList=new SinglyLinkedList();
		// create a nodes
		linkedList.head=new SinglyLinkedList.NodeList(10);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(8);
		SinglyLinkedList.NodeList nodeThree=new SinglyLinkedList.NodeList(11);
		// link nodes
		linkedList.head.next=nodeOne;
		nodeOne.next=nodeTwo;
		nodeTwo.next=nodeThree;
		//logic of find nth node from the end
		SinglyLinkedList.NodeList fastPtr=linkedList.head;
		SinglyLinkedList.NodeList slowPtr=linkedList.head;
		int position=3;
		int count=0;
		while(count<position) {
			fastPtr=fastPtr.next;
			count++;
		}
		while(fastPtr!=null){
			fastPtr=fastPtr.next;
			slowPtr=slowPtr.next;
		}
		System.out.println("the nth node is:"+slowPtr.data);
		// display nodes
		System.out.println("the linked list is:");
		linkedList.display();
	}
}
