package leetCodeAddBinary;
public class Main {
	public static void main(String[] args) {
		System.out.println(addBinary("11","1"));
	}
	public static String addBinary(String str1,String str2) {
		StringBuilder sb=new StringBuilder();
		int carry=0;
		int i=str1.length()-1;
		int j=str2.length()-1;
		while(i>=0 || j>=0) {
			int sum=carry;
			if(i>=0) sum+=str1.charAt(i)-'0';
			if(j>=0) sum+=str2.charAt(j)-'0';
			carry=sum/2;
			sb.append(sum%2);
			i--;
			j--;
		}
		if(carry!=0) sb.append(carry);
		return sb.reverse().toString();
	}
}
