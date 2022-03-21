package com.sgtesting.sampleprograms;
class Sample1
{
	String getName(String name)
	{
		return name;
	}
}
public class MethodReturn {

	public static void main(String[] args) {
    Sample1 o=new Sample1();
    String s =o.getName("santu");
    System.out.println(s);
	}

}
