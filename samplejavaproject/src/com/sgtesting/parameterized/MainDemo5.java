package com.sgtesting.parameterized;

class Birds
{
	String Firstname;
	String Color;
	int Noofwings;
	String Kingdom;
	public Birds(String firstname,String color,int noofwings,String kingdom) {
		Firstname=firstname;
		Color=color;
		Noofwings=noofwings;
		Kingdom=kingdom;
		System.out.println("FirstName :"+firstname);
		System.out.println("Color :"+color);
		System.out.println("Noofwings :"+noofwings);
		System.out.println("Kingdom :"+kingdom);
		System.out.println("++++++");
	}
}
class Animals
{
	String Firstname;
	String Kingdom;
	String Genus;
	String Species;
	public Animals(String firstname,String kingdom,String genus,String species) {
		Firstname=firstname;
		Kingdom=kingdom;
		Genus=genus;
		Species=species;
		System.out.println("First Name:"+firstname);
		System.out.println("Kingdom:"+kingdom);
		System.out.println("Genus:"+genus);
		System.out.println("Species:"+species);
		System.out.println("+++++++");
	}
}
class Plants
{
	String Firstname;
	String Kingdom;
	String Family;
	String Order;
	public Plants(String firstname, String kingdom,String family,String order) {

		Firstname=firstname;
		Kingdom=kingdom;
		Family=family;
		Order=order;
		System.out.println("First Name:"+firstname);
		System.out.println("Kingdom:"+kingdom);
		System.out.println("Family:"+family);
		System.out.println("Order:"+order);
		System.out.println("+++++");
	}
}
public class MainDemo5{
	public static void main(String[] args){
		Birds parrot=new Birds("parrot","green",2,"abc");

		Animals tiger=new Animals("tiger","abcd","pantera","tigers");

		Plants bamboo=new Plants("bamboo","plantae","poeceae","poales");


	}

}






