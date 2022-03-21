package com.sgtesting.methodswithreturnvalue;
class SumDemo1
{
	int sum()
	{
		int totalsum=0;
		for(int i=1;i<=10;i++) 
		{
			totalsum=totalsum+i;
		}
		return totalsum;
	}
	void sum1()
	{
		int totalsum=0;
		for(int i=1;i<=10;i++)
		{
			totalsum=totalsum+i;	
		}
		System.out.println("total sum of first ten numbers  "+totalsum);
	}

}
public class Sumdemo {

	public static void main(String[] args) {
		SumDemo1 obj=new SumDemo1();
		obj.sum1();
		System.out.println("---------------");
		
		int total=obj.sum();
		System.out.println(total);

	}

}
