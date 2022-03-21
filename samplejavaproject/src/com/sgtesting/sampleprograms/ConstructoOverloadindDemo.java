package com.sgtesting.sampleprograms;
class Students
{
	public Students(String Sname)
	{
		System.out.println("Name:"+Sname);

	}
	public Students(int rollno)
	{
		System.out.println("Rollno:"+rollno);
	}
	public Students(String branch,String loc)
	{
		System.out.println("Branch: "+branch+ "  Location: "+loc);

	}
}
public class ConstructoOverloadindDemo {

	public static void main(String[] args) {
		Students obj1=new Students("Santosh");
		Students obj2= new Students(10);
		Students obj3=new Students("aa", "bb");
	}

}

