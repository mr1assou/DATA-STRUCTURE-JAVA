package implement_stack_with_array;

public class Main {
	public static void main(String[] args) {
		Stack stack=new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.pop();
		stack.peek();
		stack.display();
	} 
}
