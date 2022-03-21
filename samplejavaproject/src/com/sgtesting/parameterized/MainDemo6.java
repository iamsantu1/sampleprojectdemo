package com.sgtesting.parameterized;

class Maths
{
	String Firstname;
	String Father;
	int Noofoperaters;
	String Addition;
	public Maths(String firstname,String father,int noofoperaters,String addition) {
		Firstname=firstname;
		Father=father;
		Noofoperaters=noofoperaters;
		Addition=addition;
		System.out.println("FirstName:"+firstname);
		System.out.println("Father:"+father);
		System.out.println("Noofoperater:"+noofoperaters);
		System.out.println("Addition:"+addition);
		System.out.println("++++++");	
	}
}
class Physics
{
	String Firstname;
	String Scientist;
	String Equation;
	String Law;
	public Physics(String firstname,String scientist,String equation,String law) {
		Firstname=firstname;
		Scientist=scientist;
		Equation=equation;
		Law=law;
		System.out.println("FirstName:"+firstname);
		System.out.println("Scientist:"+scientist);
		System.out.println("Equation:"+equation);
		System.out.println("Law:"+law);
		System.out.println("++++++");	
	}
}
class Chemistry
{
	String Firstname;
	String Scientist;
	String Chemical;
	String Formula;
	public Chemistry(String firstname,String scientist,String chemical,String formula) {
		Firstname=firstname;
		Scientist=scientist;
		Chemical=chemical;
		Formula=formula;
		System.out.println("FirstName:"+firstname);
		System.out.println("Scientist:"+scientist);
		System.out.println("Chemical:"+chemical);
		System.out.println("Formula:"+formula);
		System.out.println("++++++");
	}
}
public class MainDemo6{
	public static void main(String[] args){
		Maths maths=new Maths("maths","arcimedis",4,"plus");

		Physics physic=new Physics("physics","newton","f=ma","faraday");

		Chemistry chemistrys=new Chemistry("chemistry","albert","hydroclorid","hcl");

	}

}





