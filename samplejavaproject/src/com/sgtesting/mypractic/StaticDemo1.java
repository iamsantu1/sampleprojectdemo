package com.sgtesting.mypractic;
class Demoa1
{
	 void addition(int x,int y)
	{
		Demoa2.multi(3, 4);
		int res=(x+y);
		System.out.println("the result is :"+res);
	}
}
class Demoa2
{
	 static void multi(int x,int y)
	 {
		 
		
		 int res=(x*y);
		 System.out.println("the multi result is :"+res);
	 }
}
public class StaticDemo1 {
	public static void main(String[] args) {
		Demoa1 o=new Demoa1();
		o.addition(3, 4);
		
	}

}
