package com.sgtesting.sampleprograms;

public class Pattern3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			int m=i;
			for(int j=1;j<=5;j++)
			{
				System.out.print(m+" ");
				m=m+i;
			}
			
			System.out.println();
			
		}

	}

}
