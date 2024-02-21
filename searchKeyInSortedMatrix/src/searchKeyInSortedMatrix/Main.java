package searchKeyInSortedMatrix;

public class Main {
	public static void main(String[] args) {
		int [][] matrix= {{10,20,30,40},{45,25,35,45},{27,29,37,48},{32,33,39,51}};
		findKey(matrix,51);
	}
	public static void findKey(int mat [][],int key) {
		int j=mat[0].length-1;
		int i=0;
		while(i<mat.length && j>=0) {
			if(mat[i][j]==key) {
				System.out.println("element is present in the matrix");
				return;
			}
			if(mat[i][j]>key) {
				j--;
			}
			else {
				i++;
			}
		}
		System.out.println("element not found");
	}
}	
