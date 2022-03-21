package com.sgtesting.constructoroverloading;
class Univercity
{
	public Univercity(String Name)
	{
		System.out.println("Univercity: "+Name);
	}
	public Univercity(int noofstd) 
	{
		System.out.println("Noofstd: "+noofstd);
	}
	public Univercity(int zones,int noofclgs )
	{
		System.out.println("Zones: "+zones +" Noofclgs: "+noofclgs);
	}
}
public class UnivercityDemo {

	public static void main(String[] args) 
	{
		Univercity univercity=new Univercity("VTU");
		Univercity univercity2=new Univercity(5, 60);
		Univercity univercity3=new Univercity(200000);
	}

}
