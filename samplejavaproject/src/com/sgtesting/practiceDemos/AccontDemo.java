package com.sgtesting.practiceDemos;
class HDFCbank
{
	String bankname;
	private int Accno;
	void setAccountNo(int Accno)
	{
		this.Accno=Accno;
	}
	int getAccountNo()
	{
		return Accno;
	}
}
public class AccontDemo {

	public static void main(String[] args) {
		HDFCbank o=new HDFCbank();
		o.bankname="Hdfc";
		System.out.println("Bankname :"+o.bankname);
	    o.setAccountNo(247378228);
	    int a=o.getAccountNo();
	    System.out.println("bank account no"+a);
		
		
	}

}
