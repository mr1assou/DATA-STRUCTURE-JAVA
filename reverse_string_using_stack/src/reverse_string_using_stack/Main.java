package reverse_string_using_stack;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack <Character> stringStack=new Stack<>();
		String str=new String("Marwane");
		char[] stringArray=str.toCharArray();
		for(char element:stringArray) {
			stringStack.push(element);
		}
		for(int i=0;i<str.length();i++) {
			stringArray[i]=stringStack.pop();
		}
		// after reverse
		String reverseString=new String(stringArray);
		System.out.println(reverseString);
	}
}
