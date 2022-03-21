package com.sgtesting.mypractic;
class DivisionBy9
{
	int Div()
	{
		int sum=0;
		for(int i=0;i<=100;i++)
		{
			if(i%9==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class DivBy9 {

	public static void main(String[] args) {
		DivisionBy9 obj=new DivisionBy9();
		int total=obj.Div();
		System.out.println(total);

	}

}
