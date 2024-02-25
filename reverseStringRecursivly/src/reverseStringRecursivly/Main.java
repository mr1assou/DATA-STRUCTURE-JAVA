package reverseStringRecursivly;

public class Main {
	public static void main(String[] args) {
		String str="Marwane";
		System.out.println(reverse("Marwane"));
	}
	public static String reverse(String str) {
		return reverse(str,0);
	}
	public static String reverse(String str,int i) {
		if(i>=str.length()) {
			return "";
		}
		// here i want to concatenate
		return reverse(str,++i)+str.charAt(i-1);
	}
}	
