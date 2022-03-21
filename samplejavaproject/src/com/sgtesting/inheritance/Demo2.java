package com.sgtesting.inheritance;
class AA
{
	AA()
	{
		System.out.println("its is AA's Constructor");
	}
}
class BB extends AA
{
	BB()
	{
		System.out.println("its is BB's Constructor");
	}
}
class CC extends BB
{
	CC()
	{
		System.out.println("its is CC's Constructor");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		CC obj=new CC();

	}

}
