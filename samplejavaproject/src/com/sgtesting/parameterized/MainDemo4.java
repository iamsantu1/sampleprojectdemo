package com.sgtesting.parameterized;

class Metrocity
{
	String Firstname;
	String Founded;
	int Noofwards;
	String State;
	public Metrocity(String firstname,String founded,int noofwards,String state) {
		Firstname=firstname;
		Founded=founded;
		Noofwards=noofwards;
		State=state;
		System.out.println("FirstName:"+firstname);
		System.out.println("Founded:"+founded);
		System.out.println("Noofwards:"+noofwards);
		System.out.println("State:"+state);
		System.out.println("++++++");	
	}
}
class Districts
{       
	String Firstname;
	int Nooftaluks;
	int Nincode;
	String State;
	public Districts(String firstname,int nooftaluks,int pincode,String state) {
		Firstname=firstname;
		Nooftaluks=nooftaluks;
		Nincode=pincode;
		State=state;
		System.out.println("FirstName:"+firstname);
		System.out.println("Nooftaluks:"+nooftaluks);
		System.out.println("Pincode:"+pincode);
		System.out.println("State:"+state);
		System.out.println("+++++++");
	}
}
class Taluk
{
	String Firstname;
	int Noofvillages;
	int Pincode;
	String District;
	public Taluk(String firstname,int noofvillages,int pincode,String district) {
		Firstname=firstname;
		Noofvillages=noofvillages;
		Pincode=pincode;
		District=district;
		System.out.println("FirstName:"+firstname);
		System.out.println("Noofvillages:"+noofvillages);
		System.out.println("Pincode:"+pincode);
		System.out.println("District:"+district);
		System.out.println("+++++");
	}
}
public  class MainDemo4{
	public static void main(String[] args) {

		Metrocity bangalore=new Metrocity("bangalore","kempegouda",198,"Karnataka");

		Districts raichur=new Districts("bijapur",7,586104,"karnataka");

		Taluk sindhnur=new Taluk("bijapur",100,586104,"bijapur");

	}
}


