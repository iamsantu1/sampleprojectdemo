package com.sgtesting.inheritance;
class Animal
{
	void eat()
	{
		System.out.println(" eating");
	}
}
class Dog extends Animal
{
  void Run()
  {
	  System.out.println("runnng");
  }
}
public class AnimalDemo {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.eat();
		obj.Run();

	}

}
