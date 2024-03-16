package plusOne;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr= {1,4,9,9};
		System.out.println(Arrays.toString(plusOne(arr)));
	}
	public static int[] plusOne(int[] digits) {
		int n=digits.length;
		// normal case
		for(int i=n-1;i>=0;i--) {
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		//case of 99999
		int[] new_number=new int[n+1];
		new_number[0]=1;
		return new_number;
	}
}
