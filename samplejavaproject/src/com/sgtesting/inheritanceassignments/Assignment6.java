package com.sgtesting.inheritanceassignments;
//program to achieve Hierarchical inheritance in which super class and sub class contains same method name with same signature
class AnimalsDemo
{
	void Animals(String Animalname)
	{
		System.out.println("The Animal Name in AnimalsDemo class: "+Animalname);
	}
}
class AnimalsDemo1 extends AnimalsDemo
{
	AnimalsDemo1(String Animal)
	{
		super.Animals(Animal);
	}
	void Animals(String Animalname)
	{

		System.out.println("The Animal Name in AnimalsDemo1 class: "+Animalname);
	}
}
class AnimalsDemo2 extends AnimalsDemo
{
	AnimalsDemo2(String Animal)
	{
		super.Animals(Animal);
	}
	void Animals(String Animalname)
	{
		System.out.println("The Animal Name in AnimalsDemo2 class: "+Animalname);
	}
}
public class Assignment6 {

	public static void main(String[] args) {
		AnimalsDemo1 o=new AnimalsDemo1("dog");
		o.Animals("Elepant");

		AnimalsDemo2 o1=new AnimalsDemo2("dog");
		o1.Animals("Cat");


	}

}
