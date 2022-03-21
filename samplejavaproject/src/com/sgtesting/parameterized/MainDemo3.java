package com.sgtesting.parameterized;

class TwoWheelers
{
	String Firstname;
	int Noofwheeles;
	String Country;
	String Color;
	public TwoWheelers(String firstname,int noofwheeles,String country,String color) {
		Firstname=firstname;
		Noofwheeles=noofwheeles;
		Country=country;
		Color=color;
		System.out.println("Fisrt Name:"+Firstname);
		System.out.println("Noofwheeles:"+Noofwheeles);
		System.out.println("Country:"+Country);
		System.out.println("Color:"+Color);
		System.out.println("++++++++");
	}
}
class Fourwheeles
{
	String Firstname;
	String Color;
	String Country;
	int Noofwheeles;

	public Fourwheeles( String firstname,String color, String country,int noofwheeles) {
		Firstname=firstname;
		Color=color;
		Country=country;
		Noofwheeles=noofwheeles;
		System.out.println("First Name"+Firstname);
		System.out.println("Color:"+Color);
		System.out.println("Country:"+Country);
		System.out.println("Noofwheeles:"+Noofwheeles);
		System.out.println("+++++++");
	}
}
public class MainDemo3{
	public static void main(String[] args){
		TwoWheelers honda=new TwoWheelers("herohonda",2,"india","red");

		Fourwheeles bmw=new Fourwheeles("bmw","white","germany",4);

	}
}







