package com.sgtesting.noargsconstructor;

class Desktop
{
	String firstname;
	String color;
	int cost;
	String brand;
	public Desktop() {
		firstname="hp";
		color="blackcolor";
		cost=30000;
		brand="hp";
		System.out.println("First Name:"+firstname);
		System.out.println("Color:"+color);
		System.out.println("Cost"+cost);
		System.out.println("Brand"+brand);
		System.out.println("++++++++");
	}
}

class Laptop
{
	String firstname;
	int cost;
	String colour;
	int storge;
	String generation;
	String color;

	public Laptop() {
		firstname="lenova";
		cost=35000;
		color="Grey";
		generation="i5";
		System.out.println("First Name:"+firstname);
		System.out.println("Cost:"+cost);
		System.out.println("Color:"+color);
		System.out.println("Gen:"+generation);
		System.out.println("+++++++");
	}
}
class Mobile
{
	String firstname;
	int brand;
	int storage;
	int cost;
	public String shop;

	public Mobile() {
		firstname="xiamoi";
		shop="redmi";
		cost=16000;
		storage=16;
		System.out.println("First Name:"+firstname);
		System.out.println("Shop:"+shop);
		System.out.println("Cost:"+cost);
		System.out.println("Storage:"+storage);
		System.out.println("++++++++");	}
}
public class MainDemo1{
	public static void main(String[] args){
		Desktop hp =new Desktop();

		Laptop lenova =new Laptop();

		Mobile xiaomi =new Mobile();

	}

}





