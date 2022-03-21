package com.sgtesting.methods;
class Divisible4
{
	void divisible4()
	{
		for(int i=100;i>=1;i--)
		{
			if(i%4==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class DivisibleBy4 {

	public static void main(String[] args) {
		Divisible4 obj1=new Divisible4();
		obj1.divisible4();
	}

}
