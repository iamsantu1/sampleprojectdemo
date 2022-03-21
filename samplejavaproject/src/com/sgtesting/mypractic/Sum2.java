package com.sgtesting.mypractic;
class SumSample
{
	void Sum()
	{
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	int sum()
	{
		int sum=0;
		for (int i=0;i<=10;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class Sum2 {

	public static void main(String[] args) {
		SumSample o=new SumSample();
		o.Sum();
		
		int total=o.sum();
		System.out.println(total);

	}

}
