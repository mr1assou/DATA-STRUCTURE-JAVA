package insertionSortAlgorithm;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int arr[]= {5,1,9,2,10};
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
