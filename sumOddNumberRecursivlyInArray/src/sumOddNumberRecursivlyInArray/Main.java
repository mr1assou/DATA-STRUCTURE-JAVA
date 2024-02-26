package sumOddNumberRecursivlyInArray;

public class Main {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(sumOdd(arr));
	}
	public static int sumOdd(int arr[]) {
		return sumOdd(arr,0);
	}
	public static int sumOdd(int arr[],int i) {
		if(i>=arr.length) {
			return 0;
		}
		int sum=sumOdd(arr,i+1);
		if(arr[i]%2!=0) {
			sum=sum+arr[i];
		}
		return sum;
	}
}
