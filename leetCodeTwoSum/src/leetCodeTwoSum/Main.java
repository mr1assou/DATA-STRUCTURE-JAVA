package leetCodeTwoSum;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Main {
	public static void main(String[] args) {
		int[] arr= {3,2,4};
		System.out.println(Arrays.toString(twoSum(arr,6)));
	}
	public static int[] twoSum(int nums[],int target) {
		Map<Integer,Integer> complements=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			Integer complementIndex=complements.get(nums[i]);
			System.out.println(complements);
			if(complementIndex!=null) {
				return new int[] {i,complementIndex};
			}
			complements.put(target-nums[i],i);
		}
		return nums;
	}
}
