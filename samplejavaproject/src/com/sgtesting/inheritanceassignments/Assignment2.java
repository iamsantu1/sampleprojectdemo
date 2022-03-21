package com.sgtesting.inheritanceassignments;
//program to achieve Hierarchical inheritance
class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Tiger extends Animal
{
	void hunt()
	{
		System.out.println("Tiger hunting deer");
	}
}
class Deer extends Animal
{
	void run()
	{
		System.out.println("Running");
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		Tiger o=new Tiger();
		o.eat();
		o.hunt();

		Deer o1=new Deer();
		o1.eat();
		o1.run();

	}

}
