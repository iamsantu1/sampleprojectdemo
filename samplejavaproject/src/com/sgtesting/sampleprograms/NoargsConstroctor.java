package com.sgtesting.sampleprograms;
class Personss
{
	String name;
	int age;
	public Personss()
	{
		name="santosh";
		age=25;
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("---------------");

	}
}
class Bird
{
	String Bname;
	int noofwings;
	public Bird()
	{
		Bname="Sparrow";
		noofwings=2;
		System.out.println("Name:"+Bname);
		System.out.println("Noofwings:"+noofwings);
		System.out.println("---------------");
	}
}
class Animal
{
	String name;
	int nooflegs;
	public Animal()
	{
		name="dog";
		nooflegs=4;
		System.out.println("Name:"+name);
		System.out.println("Nooflegs:"+nooflegs);
		System.out.println("----------------");
	}
}
public class NoargsConstroctor {

	public static void main(String[] args) {
    Personss santu=new Personss();
    
    Bird Sparrow=new Bird();
    	
    Animal dog=new Animal();
    
    
     
	}
	

}

