package com.sgtesting.mypractic;
class EvenSample
{
	void even()
	{
		for(int i=40;i>=20;i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class EvenDemo {

	public static void main(String[] args) {
		EvenSample obj=new EvenSample();
		obj.even();

	}

}
