package leetcodePalindromeNumber;

public class Main {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
	public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=x;
		int r=0;
		while(x!=0) {
			r=r*10+x%10;
			x=x/10;
		}
		return r==n;
    }
}
