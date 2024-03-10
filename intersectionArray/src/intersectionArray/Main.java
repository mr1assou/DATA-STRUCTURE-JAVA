package intersectionArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] num1={4,9,5};
		int[] num2={9,4,9,8,4};
		System.out.println(Arrays.toString( intersection(num1,num2)));
	}
	public static int[] intersection(int nums1[],int nums2[]) {
		HashMap<Integer,Integer> hashMap=new HashMap<>();
		for(int element:nums1) {
			hashMap.put(element,1);
		}
		System.out.println("HashMap:"+hashMap);
		HashSet<Integer> set=new HashSet<>();
		for(int element:nums2) {
			if(hashMap.containsKey(element)) {
				set.add(element);
			}
		}
		System.out.println("HashSet:"+set);
		int[] array=new int[set.size()];
		int count=0;
		for(int item:set) {array[count]=item;count++;}
		return array;
	}
}
