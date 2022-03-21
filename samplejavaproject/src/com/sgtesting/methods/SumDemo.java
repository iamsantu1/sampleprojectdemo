package com.sgtesting.methods;
class SumDemo1
{
	void sumDemo1()
	{   int sum=0;
	for(int i=1;i<=100;i++)
	{
		if (i%3==0)
		{
			sum=sum+i;
		}
	}
	System.out.println(sum);
	}
}
public class SumDemo {

	public static void main(String[] args) {
		SumDemo1 obj=new SumDemo1();
		obj.sumDemo1();
	}

}
