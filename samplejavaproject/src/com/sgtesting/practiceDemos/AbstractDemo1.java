package com.sgtesting.practiceDemos;
abstract class Vehicle
{
	abstract void start();
}
class Car extends Vehicle
{
	void start()
	{
		System.out.println("the car starts with key");
	}
}
class Bike extends Vehicle
{
	void start()
	{
		System.out.println("Starts with key");
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		Car a=new Car();
		a.start();
		
		Bike o=new Bike();
		o.start();
	}

}
