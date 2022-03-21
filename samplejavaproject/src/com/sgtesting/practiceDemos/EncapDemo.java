package com.sgtesting.practiceDemos;
class Hdfc
{
	String bankname;
	private int accno;
	void setAccountNumber(int accno)
	{
		this.accno=accno;
	}
	public int getAccountNumber()
	{
		return accno;
	}
}
public class EncapDemo {

	public static void main(String[] args) {
		Hdfc s=new Hdfc();
		s.bankname="Hdfc";
		System.out.println(s.bankname);
		s.setAccountNumber(233443223);
		int accno=s.getAccountNumber();
		System.out.println(accno);

	}

}
