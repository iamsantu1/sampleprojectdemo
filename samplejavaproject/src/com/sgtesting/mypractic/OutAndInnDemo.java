package com.sgtesting.mypractic;
class AA1
{
	String fistname;
	BB o=new BB();
	void showCityName()
	{
		o.cityname="bangalore";
		System.out.println("Cityname :"+o.cityname);
	}
	class BB
	{
		String cityname;
		void showName()
		{
			fistname="Santosh";
			System.out.println("Frstname :"+fistname);
		}
	}
}

	public class OutAndInnDemo {

		public static void main(String[] args) {
			AA1 a=new AA1();
			a.showCityName();
			a.o.showName();
			


		}

	}
