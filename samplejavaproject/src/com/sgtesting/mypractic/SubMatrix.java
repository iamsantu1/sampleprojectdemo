package com.sgtesting.mypractic;
class SubMax
{
	void sub()
	{
		int x[]= {2,5,8,6};
		int y[]= {4,7,3,2};
		
		int a[]=new int[x.length];
		for(int i=0;i<x.length;i++)
		{
			a[i]=x[i]-y[i];
		}
		
		for (int m=0;m<a.length;m++)
		{
			System.out.print(a[m]+ "  ");
		}
		System.out.println();
		for (int z=a.length-1;z>=0;z--)
		{
			System.out.print(a[z]+"   ");
		}
		
	}
}
public class SubMatrix {

	public static void main(String[] args) {
   SubMax obj=new SubMax();
   obj.sub();
	}

}
