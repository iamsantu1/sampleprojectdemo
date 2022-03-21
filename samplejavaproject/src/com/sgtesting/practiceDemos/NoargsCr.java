package com.sgtesting.practiceDemos;
class Person
{
	String firstname;
	int age;
	Person(String firstname,int age)
	{
		firstname=firstname;
		this.age=age;
		System.out.println("firstname :"+firstname);
		System.out.println("age :"+age);
	}
	void show()
	{
		System.out.println("Name:"+firstname);
	}
}
class Birds
{
	String colour;
	int noofwings;
	Birds(String colour,int noofwings)
	{
		colour=colour;
		noofwings=noofwings;
		System.out.println("colour  :"+colour);
		System.out.println("onofwings :"+noofwings);
	}
}
class Animals
{
	String breed;
	public Animals(String breed) 
	{
		this.breed=breed;
		System.out.println("Breed"+breed);
	}


}
public class NoargsCr {

	public static void main(String[] args) {
	
		Person o=new Person("Santosh",19);
		o.firstname="shravan";
		o.show();
		
		Birds o1=new Birds("gray",2);
		Animals o2=new Animals("Abc");
	
	//	System.out.println("firstname :"+o.firstname);
		
	}

}
