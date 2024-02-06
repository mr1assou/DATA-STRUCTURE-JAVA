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
			SinglyLinkedList.NodeList actualNode=linkedList.head;
			linkedList.head=linkedList.head.next;
			actualNode.next=null;
		}
		else {
			SinglyLinkedList.NodeList actualNode=linkedList.head;
			SinglyLinkedList.NodeList previousNode=null;
			int count=1;
			while(count<position){
				previousNode=actualNode;
				actualNode=actualNode.next;
				count++;
			}
			SinglyLinkedList.NodeList nextNode=actualNode.next;
			previousNode.next=nextNode;
			actualNode.next=null;
		}
		// display nodes
		linkedList.display();
	}
}
