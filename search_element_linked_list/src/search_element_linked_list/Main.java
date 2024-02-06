package search_element_linked_list;


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
		//logic search an element in linkedList
		int valueToSearch=11;
		SinglyLinkedList.NodeList tmpNode=linkedList.head;
		while(tmpNode!=null) {
			if(tmpNode.data==valueToSearch) {
				System.out.println("the value "+valueToSearch+" exist");
				break;
			}
			tmpNode=tmpNode.next;
		}
		// display nodes
		//linkedList.display();
	}
}
