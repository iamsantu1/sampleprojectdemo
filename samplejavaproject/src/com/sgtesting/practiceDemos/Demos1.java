package com.sgtesting.practiceDemos;
class factDemo
{
	public factDemo(int num)
	{
		int f=1;
		for(int i=num;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println("factoria of no :"+f);
	}
}
public class Demos1 {

	public static void main(String[] args) {
		factDemo o1=new factDemo(4);
		factDemo o2=new factDemo(5);
		factDemo o3=new factDemo(6);
		
	}

}
