package leetCodeClimbStrairs;

public class Main {
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}
	public static int climbStairs(int x) {
		if(x==1) return 1;
		if(x==2) return 2;
		int prev1=2;
		int prev2=1;
		int current=0;
		for(int i=3;i<=x;i++) {
			current=prev1+prev2;
			prev2=prev1;
			prev1=current;
		}
		return current;
	}
}
