package bubbleSort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr= {5,1,9,2,10};
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
