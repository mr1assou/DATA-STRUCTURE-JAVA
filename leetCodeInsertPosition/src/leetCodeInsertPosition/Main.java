package leetCodeInsertPosition;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int []arr= {1,3,5,6};
		System.out.println(searchInsert(arr,7));
	}
	public static int searchInsert(int[] arr,int target) {
		int low=0;
		int high=arr.length-1;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return low;
	}
}
