package quickSort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr= {-3,2,-6,1,3,8,5,9,6};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static int partition(int arr[],int low,int high) {
		int i=low,j=low,k=high;
		int pivot=arr[k];
		while(i<=k) {
			if(arr[i]<=pivot) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			i++;
		}
		return j-1;
	}
	public static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int p=partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
	}
}
