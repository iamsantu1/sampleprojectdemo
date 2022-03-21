package com.sgtesting.sampleprograms;

class Student
{
	public Student(String Sname) {
	System.out.println("Student: "+Sname);
	}
	public Student(int rollno) {
		System.out.println("Rollno: "+rollno);
	}
	public Student(int salary,String sname) {
	System.out.println("Salary: "+salary);
	}
}
public class Abc {

	public static void main(String[] args) {
		Student obj1=new Student("santosh");
		Student obj2=new Student(100);
		Student obj3=new Student(23,"aa");
	}

}
