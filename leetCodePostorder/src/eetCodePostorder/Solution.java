package eetCodePostorder;

public class Solution {
	ArrayList<Integer> arrayList=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root,arrayList);
        return arrayList;
    }
    public void postorder(TreeNode root,ArrayList arrayList) {
        if(root==null)
            return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        arrayList.add(root.val);
    }
}	
