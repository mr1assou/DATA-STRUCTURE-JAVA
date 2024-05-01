package leetCodeBinaryTreePath;
import java.lang.StringBuilder;
public class Main {
	public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result=new ArrayList<>();
        if(root==null) return result;
        String str=Integer.toString(root.val);
        if(root.left==null && root.right==null) result.add(str); 
        if(root.left!=null) dfs(root.left,str,result);
        if(root.right!=null) dfs(root.right,str,result);
        return result;
    }
    public void dfs(TreeNode root,String str,ArrayList result){
        str+="->"+root.val;
        if(root.left==null && root.right==null){
            result.add(str);
            return;
        }
        if(root.left!=null){
            dfs(root.left,str,result);
        } 
        if(root.right!=null){
            dfs(root.right,str,result);
        }
    } 
}
