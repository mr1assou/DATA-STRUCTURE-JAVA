package reverse_array;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] array= {1,2,3,4};
		int tmp;
		for(int i=0,j=array.length-1;i<j;i++,j--) {
			tmp=array[i];
			array[i]=array[j];
			array[j]=tmp;
		}
		System.out.println(Arrays.toString(array));
	}
}
