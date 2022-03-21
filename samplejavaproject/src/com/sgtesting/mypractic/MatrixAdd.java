package com.sgtesting.mypractic;
class Addi
{
	int [] add(int x[],int y[])
	{
		int a[]=new int [x.length];
		for(int i=0;i<x.length;i++)
		{
			a[i]=x[i]-y[i];
		}
		return a;
	}

}
public class MatrixAdd {

	public static void main(String[] args) {
		Addi obj=new Addi();
		int x[]= {1,2,3,4};
		int y[]= {1,2,3,4};
		int a[]=obj.add(x, y);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"   ");
		}
		System.out.println();
	}

}
