package removeDuplicateFromArray;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr= {0,0,1,1,1,2,2,3,3,4};
		int j=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
