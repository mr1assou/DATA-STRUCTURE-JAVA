package implement_stack;

import java.util.EmptyStackException;

public class Stack {
	public ListNode top;
	public int length;
	public class ListNode{
		public int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
		}
	}
	public Stack() {
		top=null;
		length=0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length==0;
	}
	public void push(int data) {
		ListNode temp=new ListNode(data);
		temp.next=top;
		top=temp;
		length++;
	}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();  
		}
		int result=top.data;
		top=top.next;
		return result;
	}
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	public void display() {
		while(top!=null) {
			System.out.println(top.data);
			top=top.next;
		}
	}
}
