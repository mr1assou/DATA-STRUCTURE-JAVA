package missing_number;

public class Main {
	public static void main(String[] args) {
		int[] arr= {1,3,5,4,6,8,9,7,10};
		int n=arr.length+1;
		int sum=(n*(n+1))/2;
		for(int number:arr) {
			sum-=number;
		}
		System.out.println(sum);
	}
}
