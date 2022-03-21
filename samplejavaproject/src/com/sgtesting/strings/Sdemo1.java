package com.sgtesting.strings;
class Student
{
	String firstname;
	int age;
	Student(String fn,int age) 
	{
		firstname=fn;
		this.age=age;
	}
	public String toString()
	{
		return "the student name is " +firstname+ " age is "+age;
	}
}
public class Sdemo1 {

	public static void main(String[] args) {
		Student s=new Student("santosh", 18);
		System.out.println(s);
		
	}
		
		
}

