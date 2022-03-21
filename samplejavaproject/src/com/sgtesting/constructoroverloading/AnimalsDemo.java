package com.sgtesting.constructoroverloading;
class Animals
{
	public Animals(String name)
	{
		System.out.println("Animal: "+name);
	}
	public Animals(int age) 
	{
		System.out.println("Age: "+age);
	}
	public Animals(int nooflegs,int lifespan) 
	{
		System.out.println("Nooflegs: "+nooflegs +"   Lifespan: "+lifespan);
	}
}
public class AnimalsDemo {

	public static void main(String[] args) {
		Animals animals=new Animals("DOG");
		Animals animals2=new Animals(5);
		Animals animals3=new Animals(4, 15);
	}

}
