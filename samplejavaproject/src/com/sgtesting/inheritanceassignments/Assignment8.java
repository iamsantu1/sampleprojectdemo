package com.sgtesting.inheritanceassignments;
// program to achieve Multilevel inheritance in which super class and sub classes contains same method names with same signatures
class BookShop
{
	void book() 
	{
		System.out.println("ABC books");
	}
}
class Notebooks extends BookShop
{
	
	void book() 
	{
		super.book();
	}
	
}
class Papers extends Notebooks
{
	void book()
	{
		super.book();

	}
	
}
public class Assignment8 {
	public static void main(String[] args) {
		Papers obj=new Papers();
		obj.book();
		
	}
}
