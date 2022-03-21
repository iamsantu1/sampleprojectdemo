package com.sgtesting.mypractic;
class ReturnDemo1
{
	int Addition(int x,int y)
	{
		int res=(x+y);
		return res;
	}
	int Sub(int x,int y)
	{
		int res=(x-y);
		return res;
	}
	void Multiflcation()
	{
		int a= this.Addition(5, 5);
		int b=this.Sub(5, 3);
		int result=(a*b);
		System.out.println("multi res  "+  result);

	}
}
public class ReturnType {

	public static void main(String[] args) {
		ReturnDemo1 o=new ReturnDemo1();
		

		o.Multiflcation();
	}

}
