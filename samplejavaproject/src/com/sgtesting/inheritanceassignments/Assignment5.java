package com.sgtesting.inheritanceassignments;
class Vehicles
{
	public Vehicles(String colour)
	{
		System.out.println("colour is :"+colour);
	}
	public Vehicles(int price) {
		System.out.println("price is :"+price);
	}
}
class Cars extends Vehicles
{
	public Cars(String colour)
	{
		super(colour);
		
	}
	public Cars(int price)
	{
		super(price);
		
	}
}
class Bike extends Cars
{
	public Bike(String colour)
	{
		super(colour);
		
	}
	public Bike(int price)
	{
		super(price);
		
	}
}
public class Assignment5 {

	public static void main(String[] args) {
		Bike o=new Bike("green");
		Bike o1=new Bike(150000);

	}

}
