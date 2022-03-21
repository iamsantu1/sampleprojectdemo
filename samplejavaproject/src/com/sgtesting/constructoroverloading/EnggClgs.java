package com.sgtesting.constructoroverloading;
class EngineeringClg
{
	public EngineeringClg(String Name) 
	{
		System.out.println("Clg: "+ Name);
	}
	public EngineeringClg(int noofStudents) 
	{
		System.out.println("Noofstudents: "+noofStudents);
	}
	public EngineeringClg(int branchs, String univercity)
	{
		System.out.println("Noofbranch: "+branchs +"  Univercity: "+univercity);
	}
}
public class EnggClgs {

	public static void main(String[] args) {
		EngineeringClg clg=new EngineeringClg("KLE");
		EngineeringClg clg2=new EngineeringClg(400);
		EngineeringClg clg3=new EngineeringClg(8,"VTU");

	}

}
