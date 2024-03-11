package longestPrefixLeetCode;

public class Main {
	public static void main(String[] args) {
		String[] strs={"ab","a"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
		String firstString=strs[0];
		for(int i=0;i<=firstString.length();i++) {
			int counter=0;
			String substring=firstString.substring(0,i);
			for(int j=0;j<strs.length;j++) {
				if(strs[j].length()>=i) {
					String item=strs[j].substring(0,i);
					if(item.equals(substring)) {
						counter++;
					}
				}
			}
			if(strs.length==1 || i==firstString.length()) {
				System.out.println("@@@");
				return firstString;
			}
			if(counter!=strs.length) {
				return substring.substring(0,i-1);
			}
		}
		return "";
	}
}
