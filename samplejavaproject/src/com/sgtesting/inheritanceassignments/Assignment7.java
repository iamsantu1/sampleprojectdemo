package com.sgtesting.inheritanceassignments;
//program to achieve Hybrid inheritance in which super class contains constructor overloading
class Student1
{
	Student1(String firstname)
	{
		System.out.println("First Name :"+firstname);
	}
	
	Student1(int age)
	{
		System.out.println("Age :"+age);
	}
}

class Library extends Student1
{
	Library(String fname)
	{
		super(fname);
	}
	
	Library(int age)
	{
		super(age);
	}
}

class Sports extends Library
{
	Sports(String name)
	{
		super(name);
	}
	
	Sports(int age1)
	{
		super(age1);
	}
}
class Projects extends Student1
{
	public Projects(String pname)
	{
		super(pname);
	}
	public Projects(int Age2) 
	{
		super(Age2);
	}
}
public class Assignment7 {
	public static void main(String[] args) {
		Sports s=new Sports("Santosh");
		Sports s1=new Sports(19);
		
		Projects p=new Projects("Anand");
		Projects p1=new Projects(23);
		

	}

}
