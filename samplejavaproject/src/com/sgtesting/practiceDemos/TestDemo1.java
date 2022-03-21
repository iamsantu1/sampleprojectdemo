package com.sgtesting.practiceDemos;
class BasicMaths
{
	static void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result :"+res);
	}
	static void substraction(int x,int y)
	{
		int res=(x-y);
		System.out.println("Sub Res :"+res);
	}
	static void division(int x,int y)
	{
		try
		{
			int res=(x/y);
			System.out.println("Division Result :"+res);
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
	static void multiflication(int x,int y)
	{
		int res =(x*y);
		System.out.println("multi Res :"+res);
	}
}
public class TestDemo1 {

	public static void main(String[] args) {
		BasicMaths o=new BasicMaths();
		o.addition(4, 5);
		o.substraction(5, 0);
		o.division(2, 0);
		o.multiflication(20, 10);
	}

}
