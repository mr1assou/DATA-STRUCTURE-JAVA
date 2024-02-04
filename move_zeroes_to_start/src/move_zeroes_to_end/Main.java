package move_zeroes_to_end;

import java.util.Arrays;
	public class Main {
		public static void main(String[] args) {
			int []arr= {0,1,1,0,4,12,0};
			int j=arr.length-1;
			for(int i=arr.length-1;i>=0;i--) {
				if(arr[j]==0 && arr[i]!=0) {
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
				if(arr[j]!=0) {
					j--;
				}	
			}
		System.out.println(Arrays.toString(arr));
	}
}
	
