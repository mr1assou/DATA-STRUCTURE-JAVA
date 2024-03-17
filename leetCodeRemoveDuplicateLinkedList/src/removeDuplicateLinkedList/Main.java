package removeDuplicateLinkedList;

public class Main {
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		ListNode lst2=new ListNode(1);
		ListNode lst3=new ListNode(2);
		ListNode lst4=new ListNode(3);
		ListNode lst5=new ListNode(3);
		head.next=lst2;
		lst2.next=lst3;
		lst3.next=lst4;
		lst4.next=lst5;
		ListNode ob=deleteDuplicates(head);
		ListNode.display(ob);
	}
	public static ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        while(fastPtr!=null){
            if(fastPtr.val!=slowPtr.val){
                slowPtr.next=fastPtr;
                slowPtr=fastPtr;
            }
            fastPtr=fastPtr.next;
        }
        slowPtr.next=null;
        return head;
    }
}
