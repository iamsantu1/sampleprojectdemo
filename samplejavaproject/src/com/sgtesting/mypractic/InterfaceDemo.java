package com.sgtesting.mypractic;
interface Enggcollage
{
	void showClgName(String name);
}
class ABCEngg implements Enggcollage
{
	public void showClgName(String name)
	{
		System.out.println("Emgg clg Name:"+name);
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		ABCEngg o=new ABCEngg();
		o.showClgName("ABC engg clg");
				

	}

}
