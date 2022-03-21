package com.sgtesting.practiceDemos;
interface EnggCollage
{
	void showcollageName(String name);
	default void showCityName(String cityname)
	{
		System.out.println("city name :"+cityname);
	}
}

class SNLEngg implements EnggCollage
{
	public void showcollageName(String name)
	{
		System.out.println("Engg ckg name :"+name);
	}

}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		SNLEngg sln =new SNLEngg();
		sln.showcollageName("abcd clg");
		sln.showCityName("bangalore");
	}

}
