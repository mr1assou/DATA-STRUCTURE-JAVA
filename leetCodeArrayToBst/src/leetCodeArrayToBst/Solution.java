package leetCodeArrayToBst;

public class Solution {
	 public TreeNode sortedArrayToBST(int[] nums) {
	        if(nums.length==0) return null;
	        return constructTree(nums,0,nums.length-1);
	        }
	    public TreeNode constructTree(int[] nums,int left,int right){
	        if(left>right){ 
	            return null;
	        }
	        int midpoint=(right+left)/2;
	        TreeNode node=new TreeNode(nums[midpoint]);
	        node.left=constructTree(nums,left,midpoint-1);
	        node.right=constructTree(nums,midpoint+1,right);
	        return node;
	    }
}
