package com.sgtesting.practiceDemos;
class Additiontest
{
	public Additiontest(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			int res=a[i]+b[i];
			System.out.println(res);
		}
	}
}
public class Arry {

	public static void main(String[] args) {
		int x[]= {1,2,3,4};
		int y[]= {3,4,2,3};
		
		Additiontest o=new Additiontest(x, y);

	}

}
