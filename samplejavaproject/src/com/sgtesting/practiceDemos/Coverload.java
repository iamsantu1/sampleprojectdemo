package com.sgtesting.practiceDemos;
class Student
{
	public Student(String name)
	{
		System.out.println("Student name :"+name);
	}
	public Student(int rollno)
	{
		this("santosh");
		System.out.println("roll number :"+rollno);
	}
	public Student(String branch,int idno)
	{
		this(100);
		System.out.println("Branch :"+branch+"Idno :"+idno);
	}
}
public class Coverload {

	public static void main(String[] args) {
	Student o=new Student("SSS",3);
	}

}
