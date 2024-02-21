package printSpiralMatrix;

public class Main {
	public static void main(String[] args) {
		int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		displaySpiral(matrix,matrix.length,matrix[0].length);
	}
	public static void displaySpiral(int mat[][],int numRow,int numCol) {
		int row=numRow;
		int col=numCol;
		// l is a pointer for column and k is a pointer for row
		int l=0,k=0,i=0;
		while(k<row && l<col) {
			for(i=l;i<col;i++) {
				System.out.println(mat[k][i]);
			}
			k++;
			for(i=k;i<row;i++) {
				System.out.println(mat[i][col-1]);
			}
			col--;
			for(i=col-1;i>=l;i--) {
				System.out.println(mat[row-1][i]);
			}
			row--;
			for(i=row-1;i>=k;i--) {
				System.out.println(mat[i][l]);
			}
			l++;
		}
	}
}
