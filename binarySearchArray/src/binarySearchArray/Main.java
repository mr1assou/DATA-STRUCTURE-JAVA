package binarySearchArray;

public class Main {
	public static void main(String[] args) {
		int[] array= {1,10,20,47,59,65,75,88,99};
		int low=0;
		int high=array.length-1;
		int key=65;
		System.out.println(high);
		System.out.println(low);
		while(low<=high) {
			int mid=(high+low)/2;
			if(array[mid]==key) {
				System.out.println("we found it:"+mid);
				break;
			}
			if(array[mid]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
	}
}
