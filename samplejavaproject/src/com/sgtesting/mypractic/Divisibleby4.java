package com.sgtesting.mypractic;
class Divisible
{
	void divisionBy4()
	{
		for(int i=100;i>=0;i--)
		{
			if(i%4==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class Divisibleby4 {

	public static void main(String[] args) {
    Divisible o=new Divisible();
    o.divisionBy4();
	}

}
