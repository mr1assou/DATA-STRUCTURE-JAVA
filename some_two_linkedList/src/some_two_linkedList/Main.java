package some_two_linkedList;


public class Main {
	public static void main(String[] args) {
		// nodes of linked list one
		SinglyLinkedList.NodeList head=new SinglyLinkedList.NodeList(3);
		SinglyLinkedList.NodeList nodeOne=new SinglyLinkedList.NodeList(4);
		SinglyLinkedList.NodeList nodeTwo=new SinglyLinkedList.NodeList(3);
		// create nodes 
		SinglyLinkedList.NodeList head2=new SinglyLinkedList.NodeList(5);
		SinglyLinkedList.NodeList nodeOne2=new SinglyLinkedList.NodeList(6);
		SinglyLinkedList.NodeList nodeTwo2=new SinglyLinkedList.NodeList(4);
		// link nodes of singlLinkedList1
		head.next=nodeOne;
		nodeOne.next=nodeTwo;
		// link nodes of singlLinkedList2
		head2.next=nodeOne2;
		nodeOne2.next=nodeTwo2;
		//logic of find node of linked list
		SinglyLinkedList.display(sumTwoLinkedList(head,head2));
	}
	public static SinglyLinkedList.NodeList sumTwoLinkedList(SinglyLinkedList.NodeList head1,SinglyLinkedList.NodeList head2){
		SinglyLinkedList.NodeList temp=null;
		SinglyLinkedList.NodeList slowHead1=head1;
		SinglyLinkedList.NodeList slowHead2=head2;
		int sum;
		String stringSum;
		while(head1!=null && head2!=null) {
			sum=head1.data+head2.data;
			stringSum=String.valueOf(sum);
			if(stringSum.length()>1) {
				head1.next.data+=Character.getNumericValue(stringSum.charAt(0));
				sum=sum%10;
			}
			head2.data=sum;
			head1=head1.next;
			slowHead1.next=null;
			slowHead1=head1;
			// barrier
			head2=head2.next;
			slowHead2.next=temp;
			temp=slowHead2;
			slowHead2=head2;
		}
		return temp;
	}
}	
