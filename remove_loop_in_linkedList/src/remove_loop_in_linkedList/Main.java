package remove_loop_in_linkedList;

public class Main {
	public static void main(String[] args) {
		// create a nodes
		SinglyLinkedList.NodeList head=new SinglyLinkedList.NodeList(10);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(8);
		SinglyLinkedList.NodeList nodeThree=new SinglyLinkedList.NodeList(11);
		SinglyLinkedList.NodeList nodeFour=new SinglyLinkedList.NodeList(5);
		// link nodes
		head.next=nodeOne;
		nodeOne.next=nodeTwo;
		nodeTwo.next=nodeThree;
		nodeThree.next=nodeFour;
		nodeFour.next=nodeOne;
		//logic of find node of linked list
		SinglyLinkedList.NodeList fastPtr=head;
		SinglyLinkedList.NodeList slowPtr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			if(fastPtr==slowPtr) {
				removeLoop(head,fastPtr);
				break;
			}
		}
		SinglyLinkedList.display(head);
	}
	public static void removeLoop(SinglyLinkedList.NodeList head,SinglyLinkedList.NodeList fastPtr) {
		SinglyLinkedList.NodeList temp=head;
		while(temp.next!=fastPtr.next) {
			temp=head.next;
			fastPtr=fastPtr.next;
		}
		fastPtr.next=null;
	}
}
