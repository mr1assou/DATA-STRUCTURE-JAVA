package remove_given_key_singly_linkedList;


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
		//logic of remove a given key
		int key=1;
		if(linkedList.head.data==key) {
			linkedList.head=linkedList.head.next;
		}
		else {
			SinglyLinkedList.NodeList fastPtr=linkedList.head; 
			while(fastPtr.next.data!=key && fastPtr!=null){
				fastPtr=fastPtr.next;
			}
			fastPtr.next=fastPtr.next.next;
		}
		// display nodes
		System.out.println("the linked list is:");
		linkedList.display();
	}
}
