package com.sgtesting.practiceDemos;
class CallByValue
{
	int x,y;
	void maths(CallByValue o)
	{
		o.x=o.x+100;
		o.y=o.y+5;
		System.out.println("the value of x in method"+o.x);
		System.out.println("the value of y in the method"+o.y);
	}
}
public class CallByDemo {

	public static void main(String[] args) {
		CallByValue o=new CallByValue();
		o.x=10;
		o.y=5;
		System.out.println("the value of x before exution"+o.x);
		System.out.println("the value of y before exution"+o.y);

		o.maths(o);

		System.out.println("the value of x after excution"+o.x);
		System.out.println("the value of y before excution"+o.y);
	}

}
