package dutchNationalFlagProblem;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int []arr= {0,0,1,2,0,1,2};
		flag(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void flag(int arr[]) {
		int i=0,j=0,k=arr.length-1;
		while(i<=k) {
			if(arr[i]==0) {
				swap(arr,i,j);
				i++;
				j++;
			}
			else if(arr[i]==1) {
				i++;
			}
			else if(arr[i]==2) {
				swap(arr,i,k);
				k--;
			}
		}
	}
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
