package com.sgtesting.mypractic;

class AA
{
	public AA(String name)
	{
		System.out.println("this is AAs constructor"+name);
	}
	public AA()
	{
		
	}
}
class BB extends  AA
{
	public BB(String ename) 
	{
		super(ename);
	}
	public BB(int rr) 
	{
		System.out.println(55);
	}
	
}
class CC extends BB
{
	public CC(String cnmae)
	{
		super(cnmae);	
	}
	public CC(int ee)
	{
		super(ee);
	}
	
	
}
public class Aaaa {
	public static void main(String[] args) {
		CC o=new CC("ABC");
		CC o1=new CC(44);
	    
		
				
		
	}
}
