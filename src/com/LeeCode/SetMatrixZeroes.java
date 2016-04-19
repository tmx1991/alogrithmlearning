package com.LeeCode;

public class SetMatrixZeroes
{

	public static void main(String[] args)
	{
		SetMatrixZeroes sz = new SetMatrixZeroes();
		int[][] m = new int[][]{{1,2,3,4,5},{1,0,3,4,5},{1,2,3,4,5},{1,2,3,4,0},{1,2,3,4,5}};
		  for(int i=0;i<m.length;i++)
	        {
	        	for(int j=0;j<m[0].length;j++)
	        		System.out.print(m[i][j]+",");
	        	System.out.println();
	        }
		  
			System.out.println();
		sz.setZeroes(m);
	}
	//若为0，将其行列首项置0
    public void setZeroes(int[][] matrix) {

        boolean fr = false,fc = false;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(fr) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if(fc) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
     
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[0].length;j++)
        		System.out.print(matrix[i][j]+",");
        	System.out.println();
        }
        
        	
    }
}
