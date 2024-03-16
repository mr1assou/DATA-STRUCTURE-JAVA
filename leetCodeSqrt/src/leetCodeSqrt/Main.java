package leetCodeSqrt;

public class Main {
	public static void main(String[] args) {
		System.out.println(sqrt(2147395599));
	}
	public static int sqrt(int x) {
		if(x==0 || x==1) {
			return x;
		}
		long low=1;
		long high=x;
		while(low<=high) {
			long mid=(high+low)/2;
			if((long) mid*mid==(long) x) {
				return (int) mid;
			}
			else if(mid*mid>x) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return (int) high;
	}
}
