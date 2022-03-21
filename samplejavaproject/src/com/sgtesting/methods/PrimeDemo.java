package com.sgtesting.methods;
class PrimeDemo1
{
	void prime(int a)
	{
		int k=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				k=k+1;
			}
		}
		if(k>0)
		{
			System.out.println(a+"  is not prime number");
		}
		else
		{
			System.out.println(a+"  is prime number");
		}
	}
}
public class PrimeDemo {

	public static void main(String[] args) {
		PrimeDemo1 obj= new PrimeDemo1();
		obj.prime(11);

	}

}
