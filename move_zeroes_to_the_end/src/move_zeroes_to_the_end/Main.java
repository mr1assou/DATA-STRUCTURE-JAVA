package move_zeroes_to_the_end;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int []arr= {0,1,0,4,12,0};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[j]==0 && arr[i]!=0) {
				int tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
