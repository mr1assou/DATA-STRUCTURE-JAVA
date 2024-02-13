package valid_parenthses;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		String str=new String("[[[[()]]]]");
		Stack <Character> stack=new Stack<> ();
		for(char c:str.toCharArray()) {
			if(c=='{' || c=='[' || c=='(') {
				stack.push(c);
			}
			else {
				char top=stack.peek();
				if((c==']' && top=='[') || (c==')' && top=='(') || (c=='}' && top=='{')) {
					stack.pop();
				}
			}
		}
		System.out.println(stack.empty());
	}
}
