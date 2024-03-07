package mergeTwoSortingArray;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int []arr1= {2,5,7,9,10};
		int []arr2= {3,4,9,12,14};
		System.out.println(Arrays.toString(merge(arr1,arr2,arr1.length,arr2.length)));
	}
	public static int[] merge(int[] arr1,int[] arr2,int size1,int size2) {
		int i=0,j=0,k=0;
		int []arr3=new int[size1+size2];
		while(i<size1 && j<size2) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
			}
			else {
				arr3[k]=arr2[j];
				j++;
			}
			k++;
		}
		//if j in the end so rest value of arr1 go to arr3
		while(i<size1) {
			arr3[k]=arr1[i];
			i++;k++;
		}
		//if i in the end so rest value of arr2 go to arr3
		while(j<size2) {
			arr3[k]=arr2[j];
			j++;k++;
		}
		return arr3;
	}
}
