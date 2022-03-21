package com.sgtesting.constructoroverloading;
class Food
{
	public Food(String Name) 
	{
		System.out.println("Foodname: "+Name);
	}
	public Food(int price) 
	{
		System.out.println("Price: "+price);
	}
	public Food(String types, String size)
	{
		System.out.println("Types: "+types + "  Size: "+size);
	}
}
public class FoodItems {

	public static void main(String[] args) {

		Food food=new Food("pizza");
		Food food2=new Food(300);
		Food food3=new Food("VEG", "Normal");

	}

}
