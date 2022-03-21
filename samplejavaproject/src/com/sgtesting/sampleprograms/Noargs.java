package com.sgtesting.sampleprograms;

class Person {
	String firstname;
	int age;
	Person()
	{ 
		firstname="santosh";
		age=19;
		System.out.println("Firstname:"+firstname);
		System.out.println("Age:"+age);
		System.out.println("++++++++");

	}
}

class Birds
{
	String feathercolor;
	int noofwings;
	Birds()
	{
		feathercolor="gray";
		noofwings=2;
		System.out.println("Feathercolor:"+feathercolor);
		System.out.println("Noofwings:"+noofwings);
		System.out.println("++++++++");
	}
}
public class Noargs {
	public static void main(String[]args) {
		Person santu=new Person();
		Birds sparraw=new Birds();

	}
}
