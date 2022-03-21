package com.sgtesting.Assigments;

public class AdditionMatrix {

	public static void main(String[] args) {
		int ar[][]= {{1,2,3},{3,6,9}};
		int br[][]= {{1,2,3},{3,6,9}};

		int crr[][]=new int[ar.length][ar[0].length];

		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				crr[i][j]=ar[i][j]+br[i][j];
			}
		}
		
	
		for(int m=0;m<crr.length;m++)
		{
			for(int n=0;n<crr[m].length;n++)
			{
				System.out.println(crr[m][n]+"  ");
			
			}
		}
	
	}
}
