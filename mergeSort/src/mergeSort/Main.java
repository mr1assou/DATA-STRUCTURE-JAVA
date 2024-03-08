package mergeSort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr={9,5,2,4,3};
		int[] temp=new int[5];
		sort(arr,temp,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int arr[],int temp[],int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			System.out.println(Arrays.toString(arr));
			sort(arr,temp,low,mid);
			sort(arr,temp,mid+1,high);
			merge(arr,temp,low,mid,high);
		}
	}
	public static void merge(int arr[],int temp[],int low,int mid,int high) {
		// fill temp with element of array
		for(int i=low;i<=high;i++) {
			temp[i]=arr[i];
		}
		
		int k=low,i=low,j=mid+1;
		while(i<=mid && j<=high) {
			if(temp[i]<temp[j]) {
				arr[k]=temp[i];
				i++;
			}
			else {
				arr[k]=temp[j];
				j++;
			}
			k++;
		}
		while(i<=mid){
			arr[k]=temp[i];
			i++;k++;
		}
	}
}
