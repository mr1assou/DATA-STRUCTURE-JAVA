package palindrome;

public class Main {
	public static void main(String[] args) {
		String str="ooooooooooooooooooooooooooooooooooooooo";
		int count=0;
		for(int i=0,j=str.length()-1;i<j;i++,j--) {
			if(str.charAt(i)==str.charAt(j))
				count++;
		}
		System.out.println(count==str.length()/2 ? true : false);
	}
}
