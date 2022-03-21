package com.sgtesting.inheritanceassignments;
//program to achieve Hybrid inheritance
class Vehicle
{
	void type()
	{
		System.out.println("4 wheeler");
	}
}
class Car extends Vehicle
{
	void colour()
	{
		System.out.println("black");
	}
}
class Honda extends  Car
{
	void speed()
	{
		System.out.println("200km/h");
	}
}

class Bus extends Vehicle
{
	void coach()
	{
		System.out.println("sleeper");
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		Honda o=new Honda();
		o.type();
		o.colour();
		o.speed();


		Bus o1=new Bus();
		o1.type();
		o1.coach();

	}

}
