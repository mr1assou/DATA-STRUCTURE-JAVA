package merge_two_sorted_linkedList;

public class Main {
	public static void main(String[] args) {
		// create a nodes
		SinglyLinkedList.NodeList head=new SinglyLinkedList.NodeList(1);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(4);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(8);
		SinglyLinkedList.NodeList head2=new SinglyLinkedList.NodeList(4);
		SinglyLinkedList.NodeList nodeOne2=new SinglyLinkedList.NodeList(6);
		// link nodes 1
		head.next=nodeOne;
		nodeOne.next=nodeTwo;
		// link nodes 2
		head2.next=nodeOne2;
		//display linkedLists:
		SinglyLinkedList.display(merge(head,head2));
	}
	public static SinglyLinkedList.NodeList  merge(SinglyLinkedList.NodeList  head1,SinglyLinkedList.NodeList  head2) {
		// create dummy NodeList
		SinglyLinkedList.NodeList dummy=new SinglyLinkedList.NodeList(0); 		SinglyLinkedList.NodeList tail=dummy;
		while(head1!=null && head2!=null) {
			if(head1.data<=head2.data) {
				tail.next=head1;
				head1=head1.next;
			}
			else if(head2.data<head1.data) {
				tail.next=head2;
				head2=head2.next;
			}
			tail=tail.next;
		}
		if(head1==null) {
			tail.next=head2;
		}
		else {
			tail.next=head1;
		}
		return dummy.next;
	}
}
