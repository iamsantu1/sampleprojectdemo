package com.sgtesting.sampleprograms;
class Persons
{
	String name;
	int age;
}
class Birdss
{
	String Bname;
	int noofwings;
}
class Animals
{
	String name;
	int nooflegs;
}
public class MainDemoClass {

	public static void main(String[] args) {
     Persons santu=new Persons();
     santu.name="Santosh";
     santu.age=25;
     System.out.println("Name :"+santu.name);
     System.out.println("Age:"+santu.age);
     System.out.println("---------------------");
     
     Birdss aa=new Birdss();
     aa.Bname="Sparrow";
     aa.noofwings=2;
     System.out.println("Name:"+aa.Bname);
     System.out.println("Noofwings:"+aa.noofwings);
     System.out.println("-----------------");
     
     Animals dog=new Animals();
     dog.name="tomy";
     dog.nooflegs=4;
     System.out.println("Name:"+dog.name);
     System.out.println("nooflegs:"+dog.nooflegs);
     
     
	}
	

}
