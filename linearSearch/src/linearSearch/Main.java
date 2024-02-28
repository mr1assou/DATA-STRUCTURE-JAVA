package linearSearch;

public class Main {
	public static void main(String[] args) {
		int[] arr= {3,7,9,10,2,5,8};
		int key=5;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("exist");
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("doesn't exist");
	}
}
