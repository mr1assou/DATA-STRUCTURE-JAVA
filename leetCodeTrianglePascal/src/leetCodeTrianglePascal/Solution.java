package leetCodeTrianglePascal;
import java.util.List;
import java.util.ArrayList;
public class Solution {
	 public List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> triangle=new ArrayList<>();
	        if(numRows==0) return triangle;
	        List<Integer> firstRow=new ArrayList<>();
	        firstRow.add(1);
	        triangle.add(firstRow);
	        for(int i=1;i<numRows;i++){
	            List<Integer> prevRow=triangle.get(i-1);
	            List<Integer> row=new ArrayList<>();
	            row.add(1);
	            for(int j=1;j<i;j++){
	                row.add(prevRow.get(j)+prevRow.get(j-1));
	            }
	            row.add(1);
	            triangle.add(row);
	        }
	        return triangle;
	    }
}
