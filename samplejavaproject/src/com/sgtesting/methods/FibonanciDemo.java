package com.sgtesting.methods;
class FibonanciDemo1
{
	void fibonanci()
	{
		int f1=0;
		int f2=1;
		for(int i=0;i<=10;i++)
		{
			System.out.println(f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
		}
	}
}
public class FibonanciDemo {

	public static void main(String[] args) {
		FibonanciDemo1 demo1=new FibonanciDemo1();
		demo1.fibonanci();
	}

}
