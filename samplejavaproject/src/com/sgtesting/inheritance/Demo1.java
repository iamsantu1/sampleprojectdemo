package com.sgtesting.inheritance;
class Maths1
{
	void Adition(int x,int y)
	{
		System.out.println("Addition Result:"+(x+y));
	}
}
class	Maths2 extends Maths1
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}
class Maths3 extends Maths1
{
	void Multiflication(int x,int y)
	{
		System.out.println("the multiflication result:"+(x*y));
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Maths2 o=new Maths2();
		o.Adition(20, 40);
		o.substraction(40, 15);
		
		Maths3 o1=new Maths3();
		o1.Adition(40, 50);
		o1.Multiflication(4, 5);
	}

}
