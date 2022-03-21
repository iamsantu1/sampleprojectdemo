package com.sgtesting.mypractic;
class PrimeSample
{
	boolean prime(int a)
	{
		int k=0;
		for(int i=2;i<=a;i++)
		{
			if(a%i==0)
			{
				k=k+1;
				break;
			}
		}
		if(k==0)
			return true;
		else
			return false;
	}
}
public class Prime1 {

	public static void main(String[] args) {
		PrimeSample o=new PrimeSample();
		boolean s1=o.prime(21);
		System.out.println(s1);

	} 

}
