package com.sgtesting.inheritanceassignments;
//program to achieve Multilevel inheritance in which super class contains parameterized constructor
class Employee
{
	public Employee(String ename) 
	{
		System.out.println(ename);
	}
	
}
class Department extends Employee
{
	public Department(String branch) 
	{
		super("santosh");
		System.out.println(branch);
	}
	
}
class Empno extends Department
{
	public Empno(int eno)
	{
		super("CSE");
		System.out.println(eno);
	}
}
public class Assignment4 {

	public static void main(String[] args) {
    Empno o=new Empno(101);
    
    
	}

}
