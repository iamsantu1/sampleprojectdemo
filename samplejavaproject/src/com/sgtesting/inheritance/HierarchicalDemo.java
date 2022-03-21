package com.sgtesting.inheritance;
class Maths11
{
	void adddition(int x,int y)
	{
		System.out.println("The addition result is :"+(x+y));
	}
}
class Maths22 extends Maths11
{
	void substaction(int x,int y)
	{
		System.out.println("The Substraction result is:"+(x-y));

	}
}
class Maths33 extends Maths11
{
	void maltiflication(int x,int y)
	{
		System.out.println("The multiflication result is "+(x*y));
	}
}
public class HierarchicalDemo {

	public static void main(String[] args) {
		Maths22 o=new Maths22();
		o.adddition(3, 4);
		o.substaction(3, 4);
		
		Maths33 o1=new Maths33();
		o1.adddition(3, 4);
		o1.maltiflication(3, 4);
	}

}
