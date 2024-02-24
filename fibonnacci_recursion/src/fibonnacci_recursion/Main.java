package fibonnacci_recursion;

public class Main {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=5;i++)
			System.out.println(fibo(i));
	}
	public static int fibo(int n) {
		if(n<2) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
}
