package recursivePalindromeString;

public class Main {
	public static void main(String[] args) {
		System.out.println(isPalindrome("pipo"));
	}
	public static boolean isPalindrome(String str) {
		if(str.length()<=1) {
			return true;
		}
		char firstChar=str.charAt(0);
		char lastChar=str.charAt(str.length()-1);
		if(firstChar!=lastChar) {
			return false;
		}
		String substring=str.substring(1,str.length()-1);
		return isPalindrome(substring);
	}
}
