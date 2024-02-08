package find_start_of_loop_linkedList;

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
				System.out.println("the tip of loop is:"+getTipOfLoop(head,fastPtr));
				break;
			}
		}
		System.out.println("Loooop is detected");
	}
	public static int getTipOfLoop(SinglyLinkedList.NodeList head,SinglyLinkedList.NodeList fastPtr) {
		SinglyLinkedList.NodeList temp=head;
		while(head!=fastPtr) {
			head=head.next;
			fastPtr=fastPtr.next;
		}
		return head.data;
	}
}
