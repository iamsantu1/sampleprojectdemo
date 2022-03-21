package com.sgtesting.constructoroverloading;
class Professor
{
	public Professor(String Name) 
	{
		System.out.println("Professor: "+Name);
	}
	public Professor(int salary)
	{
		System.out.println("Salary: "+salary);
	}
	public Professor(int idno,String subject)
	{
		System.out.println("Idno: "+idno +"   Subject: "+subject);
	}
	public Professor(String collage,String univercity) 
	{
		System.out.println("Collage: "+collage+ "  Univercity: "+univercity);
	}
}
public class ProfessorDemo {

	public static void main(String[] args) {
		Professor professor=new Professor("Mahesh");
		Professor professor2=new Professor(50000);
		Professor professor3=new Professor(15, "  maths");
		Professor professor4=new Professor("KLE", "VTU");

	}

}
