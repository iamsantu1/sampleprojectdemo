package com.sgtesting.mypractic;
class Department
{
	public Department(String dname) 
	{
		System.out.println("Department name"+dname);
	}
	public Department(int dno) 
	{
		this("Accounting");
		System.out.println("Department no"+dno);
	}
	public Department(String ename,int idno)
	{
		this(22);
		System.out.println(ename+idno);
	}
}
class Student extends Department
{
	public Student(String sname)
	{
		super("aa");
	}
}


public class ChainingDemo {

	public static void main(String[] args) {
		Student o=new Student("aaaaaaa");
		

	}

}
