package com.sgtesting.mypractic;
class CallSample
{
	void acc(int num)
	{
		int f=1;
		for(int i=num;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println("the factorial of given num:"+f);
	}
	
}

public class CallV {

	public static void main(String[] args) {
		CallSample o=new CallSample();
		o.acc(4);
		o.acc(5);
		o.acc(5);
		o.acc(6);
	}

}
