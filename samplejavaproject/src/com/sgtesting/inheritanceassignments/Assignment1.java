package com.sgtesting.inheritanceassignments;
//program to achieve Multilevel inheritance
class Student
{
	void name()
	{
		System.out.println("Santosh");
	}
}
class Diffartment extends Student
{
	void branch() 
	{
		System.out.println("CSE");
	}
}
class Subject extends Diffartment
{
	void sub()
	{
		System.out.println("Programming");
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		Subject o=new Subject();
		o.name();
		o.branch();
		o.sub();

	}

}
