package com.sgtesting.parameterized;

class Desktop
{
	String Firstname;
	String Color;
	int Cost;
	String Brand;

	public Desktop(String firstname,String color,int cost,String brand) {
        Firstname=firstname;
        Color=color;
        Cost=cost;
        Brand=brand;
		System.out.println("First Name:"+Firstname);
		System.out.println("Color:"+Color);
		System.out.println("Cost:"+Cost);
		System.out.println("Brand:"+Brand);
		System.out.println("++++++++");
	}
}

class Laptop
{
	String Firstname;
	int Cost;
	String Color;
	String Generation;

	public Laptop(String firstname,int cost,String color,String generation) {
		Firstname=firstname;
		Cost=cost;
		Color=color;
		Generation=generation;
		System.out.println("First Name:"+Firstname);
		System.out.println("Cost:"+Cost);
		System.out.println("Color:"+Color);
		System.out.println("Gen:"+Generation);
		System.out.println("+++++++");
	}
}
class Mobile
{
	String Firstname;
	String Shop;
	int Cost;
	String Storage;
	public Mobile(String firstname,String shop,int cost,String storage) {
		Firstname=firstname;
		Shop=shop;
		Cost=cost;
		Storage=storage;
		System.out.println("First Name:"+Firstname);
		System.out.println("Shop:"+Shop);
		System.out.println("Cost:"+Cost);
		System.out.println("Storage:"+Storage);
		System.out.println("++++++++");	
	}
}
public class MainDemo1{
	public static void main(String[] args){
		Desktop hp =new Desktop("dell","red",56000,"gh");

		Laptop lenova =new Laptop("lenova",35000,"green","8th");

		Mobile xiaomi =new Mobile("xiami","redmi",15000,"32gb");

	}

}





