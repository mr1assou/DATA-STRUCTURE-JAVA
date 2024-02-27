package occurenceOfKeyArray;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int arr[]= {5,3,2,5,1};
		System.out.println(occurenceOfKey(arr,0,2));
	}
	public static int occurenceOfKey(int arr[],int count,int key) {
		if(arr.length==0) {
			return count;
		}
		if(arr[0]==key) {
			++count;
		}
		int[] sliceArray=Arrays.copyOfRange(arr,1,arr.length);
		return occurenceOfKey(sliceArray,count,key);
	}
}
