package com.sgtesting.abstracts;
abstract class Enggcollage
{
	abstract void showName(String name);
	abstract void cityName(String cname);
}
class SLNEngg extends Enggcollage
{
	void showName(String name)
	{
		System.out.println("Name :"+name);
	}
	void cityName(String cname) 
	{
		System.out.println("CityName :"+cname);
	}
	void ShowAdd(String aname)
	{
		System.out.println("Add Name:"+aname);
	}
}


public class AbsractDemo1 {

	public static void main(String[] args) {
		SLNEngg obj=new SLNEngg();
		obj.showName("Santosh");
		obj.cityName("bijapur");
		obj.ShowAdd("ABC ");
		
	}
}
