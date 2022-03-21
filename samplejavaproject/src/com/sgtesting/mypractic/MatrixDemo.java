package com.sgtesting.mypractic;
class MatrixAddition
{
	void Addition()
	{
		int x[]= {2,5,8,6};
		int y[]= {4,7,3,2};
		
		int a[]=new int[x.length];
		for(int i=0;i<x.length;i++)
		{
			a[i]=x[i]+y[i];
		}
		//System.out.println(a[i]);
		for (int m=0;m<a.length;m++)
		{
			System.out.print(a[m]+ "  ");
		}
	}
	
}
public class MatrixDemo {

	public static void main(String[] args) {
    MatrixAddition o=new MatrixAddition();
    o.Addition();
	}

}
