package com.sgtesting.constructoroverloading;
class SoftwareEngg
{
	public SoftwareEngg(String Name) {
		System.out.println("SoftwareEngg: "+Name);
	}
	public SoftwareEngg(int salary) {
		System.out.println("Salary: "+salary);
	}
	public SoftwareEngg(int idno,String company) {
		System.out.println("Idno: "+idno+ "  Company: "+company);
	}
	public SoftwareEngg(String designation, int mobileno ) {
		System.out.println("Designation: "+designation+"   Mobileno: "+mobileno);
	}
}
public class SoftwareEnggDemo {

	public static void main(String[] args) {
		SoftwareEngg engg=new SoftwareEngg("Santosh");
		SoftwareEngg engg2=new SoftwareEngg(100, "XYZ");
		SoftwareEngg engg3=new SoftwareEngg(45000);
		SoftwareEngg engg4=new SoftwareEngg("tester",87220443);
	}
}
