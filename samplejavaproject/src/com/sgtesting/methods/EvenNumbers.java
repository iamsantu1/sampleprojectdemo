package com.sgtesting.methods;
class EvenNumber
{
	void evenNumber()
	{
		for (int i=40;i>=20;i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class EvenNumbers {

	public static void main(String[] args) {
		EvenNumber obj1=new EvenNumber();
		obj1.evenNumber();
	}

}
