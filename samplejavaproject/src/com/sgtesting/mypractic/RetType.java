package com.sgtesting.mypractic;
class RetSample
{
	int aa(int num)
	{
		int f=1;
		for(int i=num;i>=1;i--)
		{
			f=f*i;
		}
		return f;
	}
}
public class RetType {

	public static void main(String[] args) {
		RetSample o=new RetSample();
		int s=o.aa(4);
		System.out.println(s);
		
		
	}

}
