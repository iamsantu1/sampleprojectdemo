package com.sgtesting.practiceDemos;
class Outer
{
	String name;
	
	
	Inner i=new Inner();
	void displaycity()
	{
		i.cityname="bijapur";
		System.out.println("CITY NAME :"+i.cityname);
	}
	class Inner
	{
		String cityname;
		void showName()
		{
			name="santosh";
			System.out.println("Firstname :"+name);
		}
	}
}
public class Demoabc1 {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.displaycity();
		o.i.showName();
	}

}
