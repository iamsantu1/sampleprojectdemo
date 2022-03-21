package com.sgtesting.sampleprograms;

public class ArrayDemo {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if (i%7==0)
			{
				count=count+1;
			}
		}
		int a[]=new int [count];
		int k=0;
		for(int j=1;j<=100;j++)
		{
			if(j%7==0)
			{
				a[k]=j;
				k=k+1;
			}
		}
		for(int m=a.length-1;m>=0;m--)
		{
			System.out.println(a[m]);
			
		}
	}
}
