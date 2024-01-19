/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marwa
 */
public class Multiply {
    public static void main(String[] args){
        System.out.println("This is me");
        System.out.println("Hello world");
	int[][] A={{1,2,3},{4,5,6}};
        int[][] B={{1,2},{3,4},{5,6}};
        int [][] C={{0,0},{0,0}};
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int s=0;
                for(int k=0;k<3;k++){
                    s=s+A[i][k]*B[k][j];
                }
                C[i][j]=s;
            }
        }
        System.out.printf("%d\n",C[0][0]);
        System.out.printf("%d\n",C[0][1]);
        System.out.printf("%d\n",C[1][0]);
        System.out.printf("%d\n",C[1][1]);
    }
}
