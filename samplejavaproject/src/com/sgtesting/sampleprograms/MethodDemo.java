package com.sgtesting.sampleprograms;
class Calculation1
{
	void Addtion(int x,int y)
	{
		
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
	void Multiflication(int x,int y)
	{
		
		int res=(x*y);
		System.out.println("The multiflication Result:"+res);
	}
}
public class MethodDemo {

	public static void main(String[] args) {
		Calculation1 obj1=new Calculation1();
		obj1.Addtion(5, 10);
		obj1.Multiflication(5, 7);
		
		obj1.Addtion(3, 7);
		obj1.Multiflication(5, 3);
	}

}
