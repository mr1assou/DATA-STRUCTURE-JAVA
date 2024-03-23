package maximumDepthOfbinaryTree;

public class Solution {
	public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return maxDepth(root,1,1);
    }
    public int maxDepth(TreeNode root,int max,int level){
        if(root==null){
            return max;
        }
        if(level>max){
            max=level;
        }
        max=maxDepth(root.left,max,level+1);
        max=maxDepth(root.right,max,level+1);
        return max;
    }
}
