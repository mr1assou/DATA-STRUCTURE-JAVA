package implement_stack_with_array;


public class Stack {
	public int length=0;
	public int top=-1;
	public int[] arr;
	public Stack(int capacity){
		arr=new int[capacity];
	}
	public boolean isEmpty() {
		return length==0;
	}
	public void push(int data) {
		length++;
		top++;
		arr[top]=data;
	}
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is Empty Sorry");
		}
		int result=arr[top];
		top--;
		length--;
		return result;
	}
	public void peek() {
		System.out.println(arr[top]);
	}
	public void display() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is Empty Sorry");
		}
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}


