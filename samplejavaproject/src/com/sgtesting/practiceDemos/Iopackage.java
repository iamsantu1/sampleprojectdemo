package com.sgtesting.practiceDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Iopackage {

	public static void main(String[] args) {
		readContent();
	}
	
	private static void readContent()
	{
		FileInputStream fin=null;
		int n=0;
		try
		{
			fin=new FileInputStream("C:\\CITY\\DEMO\\sample.txt");
			while(true)
			{
				n=fin.read();
				if(n==-1)
				{
					break;
				}
				char ch=(char) n;
				System.out.print(ch);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
