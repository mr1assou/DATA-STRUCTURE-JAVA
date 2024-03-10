package leetCodeTwoSum;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
public class Main {
	public static void main(String[] args) {
		int[] arr= {3,3,3};
		System.out.println(Arrays.toString(twoSum(arr,6)));
	}
	public static int[] twoSum(int nums[],int target) {
		HashMap<Integer,Integer> hashMap=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			hashMap.put(nums[i],i);
		}
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			int sub=target-nums[i];
			if(hashMap.containsKey(sub) && hashMap.get(sub)!=i) {
				set.add(i);
				set.add(hashMap.get(sub));
			}
		}
		int[] array=new int[set.size()];
		int count=0;
		for(int num:set) {array[count]=num;count++;}
		return array;
	}
}
