package maxOfArryRecursivly;

public class Main {
	public static void main(String[] args) {
		int[] array= {5,10,7,1,0};
		System.out.println(maximum(array,0));
	}
	public static int maximum(int array[],int i) {
		if(i>array.length-1) {
			return Integer.MIN_VALUE;
		}
		int value=array[i];
		int garbage=maximum(array,++i);
		if(garbage>value) {
			value=garbage;
		}
		return value;
	}
}
