package leetCodeRomanToInteger;
import java.util.HashMap;
public class Main {
	public static void main(String[] args) {
		System.out.println(romanInteger("IV"));
	}
	public static int romanInteger(String s) {
		HashMap<Character,Integer> hashMap=new HashMap<>();
		hashMap.put('I',1);
		hashMap.put('V',5);
		hashMap.put('X',10);
		hashMap.put('L',50);
		hashMap.put('C',100);
		hashMap.put('D',50);
		hashMap.put('M',1000);
		int sum=0;
		for(int i=0;i<s.length()-1;i++) {
			if((s.charAt(i)=='C' && s.charAt(i+1)=='M') || (s.charAt(i)=='C' && s.charAt(i+1)=='D') 
				|| (s.charAt(i)=='I' && s.charAt(i+1)=='X') || (s.charAt(i)=='I' && s.charAt(i+1)=='V') 
				|| (s.charAt(i)=='X' && s.charAt(i+1)=='L') || (s.charAt(i)=='X' && s.charAt(i+1)=='C')) {
				sum=sum+(hashMap.get(s.charAt(i+1))- hashMap.get(s.charAt(i)));
				
				i++;
			}
			else {
				sum+=hashMap.get(s.charAt(i));
			}
		}
		return sum;
	}
}
