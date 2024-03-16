package twoSortedLinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList linkedList1=new LinkedList();
		LinkedList.ListNode node1=new LinkedList.ListNode(4);
		LinkedList.ListNode node2=new LinkedList.ListNode(7);
		LinkedList.ListNode node3=new LinkedList.ListNode(10);
		linkedList1.head=node1;
		node1.next=node2;
		node2.next=node3;
		LinkedList linkedList2=new LinkedList();
		LinkedList.ListNode node4=new LinkedList.ListNode(1);
		LinkedList.ListNode node5=new LinkedList.ListNode(3);
		LinkedList.ListNode node6=new LinkedList.ListNode(4);
		linkedList2.head=node4;
		node4.next=node5;
		node5.next=node6;
		LinkedList.ListNode current=mergeTwoLists(linkedList1.head,linkedList2.head);
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	//LinkedList.ListNode
	public static LinkedList.ListNode mergeTwoLists(LinkedList.ListNode list1,LinkedList.ListNode list2) {
		LinkedList.ListNode a=list1;
		LinkedList.ListNode temp1=a;
		LinkedList.ListNode b=list2;
		LinkedList.ListNode temp2=b;
		while(a!=null && b!=null) {
			if(a.data<=b.data) {
				a=a.next;
				temp1.next=b;
				temp1=a;
			}
			else if(b.data<a.data) {
				b=b.next;
				temp2.next=a;
				temp2=b;
			}
		}
		return list1.data<=list2.data? list1:list2;
	}
}
