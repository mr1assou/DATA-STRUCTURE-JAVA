package some_two_linkedList;


public class Main {
	public static void main(String[] args) {
		// nodes of linked list one
		SinglyLinkedList.NodeList head=new SinglyLinkedList.NodeList(7);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(4);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(9);
		// create nodes 
		SinglyLinkedList.NodeList head2=new SinglyLinkedList.NodeList(5);
		SinglyLinkedList.NodeList nodeOne2=new SinglyLinkedList.NodeList(6);
		// link nodes of singlLinkedList1
		head.next=nodeOne;
		nodeOne.next=nodeTwo;
		// link nodes of singlLinkedList2
		head2.next=nodeOne2;
		//logic of find node of linked list
		SinglyLinkedList.display(sumTwoLinkedList(head,head2));
	}
	public static SinglyLinkedList.NodeList sumTwoLinkedList(SinglyLinkedList.NodeList a,SinglyLinkedList.NodeList b){
		SinglyLinkedList.NodeList dummy=new SinglyLinkedList.NodeList(0);
		SinglyLinkedList.NodeList tail=dummy;
		int carry=0;
		while(a!=null || b!=null) {
			int x=(a!=null) ?a.data:0;
			int y=(b!=null) ?b.data:0;
			int sum=carry+x+y;
			carry=sum/10;
			tail.next=new SinglyLinkedList.NodeList(sum %10);
			tail=tail.next;
			if(a!=null) a=a.next;
			if(b!=null) b=b.next;
		}
		if(carry>0) {
			tail.next=new SinglyLinkedList.NodeList(carry);
		}
		return dummy.next;
	}
}	
