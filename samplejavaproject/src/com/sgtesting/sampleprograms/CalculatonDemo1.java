package com.sgtesting.sampleprograms;
class Calculatin3
{
	int addition(int x,int y)
	{
		int res =(x+y);
		return res;
	}
	int substraction(int x,int y)
	{
		int res=(x-y);
		return res;
	}
	void multiflication(int a,int b)
	{
		int result=(a*b);
		System.out.println("Result:"+result);
	}
}
public class CalculatonDemo1 {

	public static void main(String[] args) {
     Calculatin3 o=new Calculatin3();
     int p=o.addition(4, 7);
     int q=o.substraction(8, 5);
     
    o.multiflication(p, q);
	}

}
