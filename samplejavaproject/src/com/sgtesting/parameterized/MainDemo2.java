
package com.sgtesting.parameterized;

class Fruits
{
	String Firstname;
	String Kingdom;
	String Colour;
	String Family;

	public Fruits(String firstname,String kingdom,String colour,String family) {
		Firstname=firstname;
		Kingdom=kingdom;
		Colour=colour;
		Family=family;
		System.out.println("First name:"+Firstname);
		System.out.println("Kingdom:"+Kingdom);
		System.out.println("Colour:"+Colour);
		System.out.println("Family:"+Family);
		System.out.println("++++++++");	
	}
}
class Flower
{
	String Firstname;
	String Genus1;
	String Colour;
	String Kingdom;

	public Flower(String firstname,String genus1,String colour,String kingdom) {
		Firstname=firstname;
		Genus1=genus1;
		Colour=colour;
		Kingdom=kingdom;
		System.out.println("First name:"+Firstname);
		System.out.println("Genus1:"+Genus1);
		System.out.println("Colour:"+Colour);
		System.out.println("kingdom:"+Kingdom);
		System.out.println("+++++++");
	}
}
class Vegetable
{
	String Firstname;
	String Family;
	String Species;
	String Genus;
	public Vegetable(String firstname,String family,String species,String genus) {

		Firstname=firstname;
		Family=family;
		Species=species;
		Genus=genus;
		System.out.println("First name:"+Firstname);
		System.out.println("Family:"+Family);
		System.out.println("Species:"+Species);
		System.out.println("Genus:"+Genus);
		System.out.println("++++++++");
	}
}
public class MainDemo2{
	public static void main(String[] args){
		Fruits apple=new Fruits("apple","Appless","red","Apples1");

		Flower Rose=new Flower("rose","rosi","pink","romeria");

		Vegetable onion=new Vegetable("onion","zbc","aaa","hgh");



	}
}









