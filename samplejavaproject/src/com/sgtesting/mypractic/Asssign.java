package com.sgtesting.mypractic;

class Vehicles
{
	public Vehicles(String colour)
	{
		System.out.println("vehicle colour is :"+colour);
	}
	public Vehicles(int price) {
		System.out.println("vehicle price is :"+price);
	}
}
class Cars extends Vehicles
{
	public Cars(String colour)
	{
		super("red");
		System.out.println("the car colour is :"+colour);
	}
	public Cars(int price)
	{
		super(5000000);
		System.out.println("the car price is :"+price);
	}
}
class Bike extends Cars
{
	public Bike(String colour)
	{
		super("black");
		System.out.println("the bike colour is :"+colour);
	}
	public Bike(int price)
	{
		super(2000000);
		System.out.println("the bike colour is :"+price);
	}
}
public class Asssign {

	public static void main(String[] args) {
		Bike o=new Bike("green");
		Bike o1=new Bike(150000);

	}

}

