package com.sgtesting.mypractic;
class SumNo
{
	void sum()
	{
		int sum=0;
		for(int i=0;i<=100;i++)
		{
			if(i%3==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
public class Sum1 {

	public static void main(String[] args) {
      SumNo obj=new SumNo();
      obj.sum();
	}

}
