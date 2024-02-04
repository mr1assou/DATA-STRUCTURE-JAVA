package remove_even_number;

public class Main {
	public static void main(String[] args) {
		int[] array= {4,5,12,7,11};
		System.out.println("The odd numbers are:\n");
		for(int item:array) {
			if(item%2!=0) {
				System.out.println(item);
			}
	}
}
