package com.sgtesting.methods;
class AdditionDemo
{
	void addition(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];	
			}

		}
		for(int m=0;m<c.length;m++)
		{
			for(int n=0;n<c[m].length;n++)
			{
				System.out.print(c[m][n]+"  ");
			}
			System.out.println();
		}

	}
}
public class AdditionMatrix {
	public static void main(String[] args)
	{
		AdditionDemo obj=new AdditionDemo();
		int x[][]={{1,4,5,},{4,6,8}};
		int y[][]= {{2,6,4},{4,8,5}};
		obj.addition(x, y);
	}
}
