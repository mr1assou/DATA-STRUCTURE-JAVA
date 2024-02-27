package maxOfArrayRecursivly;

public class Main {
	public static void main(String[] args) {
		int[] arr= {7,12,6,9,6};
		System.out.println(maxRecursivly(arr,0));
	}
	public static int maxRecursivly(int arr[],int index) {
		if(index>=arr.length) {
			return arr[index-1];
		}
		int max=maxRecursivly(arr,index+1);
		if(arr[index]>max) {
			max=arr[index];
		}
		return max;
	}
}
