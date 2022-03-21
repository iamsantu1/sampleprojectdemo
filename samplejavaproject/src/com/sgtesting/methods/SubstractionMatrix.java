package com.sgtesting.methods;
class SubstractionDemo
{
	void substraction(int arr[][],int brr[][])
	{
		int crr[][]=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				crr[i][j]=arr[i][j]-brr[i][j];
			}
		}
		System.out.println("substraction of matrix in sequence order");
		for(int m=0;m<crr.length;m++)
		{
			for(int n=0;n<crr[m].length;n++)
			{
				System.out.print(crr[m][n]+"  ");
			}
			System.out.println();
		}
		System.out.println("substraction of matrix in reverse order");
		for(int x=crr.length-1;x>=0;x--)
		{
			for(int y=crr[x].length-1;y>=0;y--)
			{
				System.out.print(crr[x][y]+"  ");
			}
			System.out.println();
		}

	}
}
public class SubstractionMatrix {

	public static void main(String[] args) {
		SubstractionDemo obj=new SubstractionDemo();
		int x[][]={{1,4,5,},{4,6,8}};
		int y[][]= {{2,6,4},{4,8,5}};
		obj.substraction(x, y);
	}

}
