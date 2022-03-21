package com.sgtesting.methods;
class ReverseDemo1
{
	void reverse(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}
public class ReverseDemo {

	public static void main(String[] args) {
		ReverseDemo1 demo=new ReverseDemo1();
		int x[]= {2,4,8,12};
		demo.reverse(x);
	}

}
