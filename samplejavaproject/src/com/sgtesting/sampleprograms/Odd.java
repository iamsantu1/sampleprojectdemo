package com.sgtesting.sampleprograms;

public class Odd {

	public static void main(String[] args)
	{
	  int	count=0;
     for (int i=51;i>=31;i--)
     {
    	 if(i%2!=0)
    	 {
    		 count=count+1;
    	 }
     }
      int a[]=new int[count];
      int k=0;
      for (int j=52;j>=31;j--)
      {
    	  if(j%2!=0)
    	  {
    		  a[k]=j;
    		  k=k+1;
    	  }
      }
      for(int zz:a)
      System.out.println(zz);
	}

}
