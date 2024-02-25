package recursiveExponential;

public class Main {
	public static void main(String[] args) {
		System.out.println(expo(3.5,4));
	}
	public static double expo(double base,double expo) {
		if(expo==0) {
			return 1;
		}
		return base*expo(base,expo-1);
	}
}
