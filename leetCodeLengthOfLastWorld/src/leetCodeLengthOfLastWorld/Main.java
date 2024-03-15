package leetCodeLengthOfLastWorld;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String str="fly me to the moon ";
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-1].length());
	}
}
