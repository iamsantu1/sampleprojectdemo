package com.sgtesting.Assigments;

public class Add1 {

	public static void main(String[] args) {
      int a[][]= {{1,2,3,4},{3,3,4,5}};
      int b[][]= {{3,4,6,3},{2,3,2,5}};
      
      int c[][]=new int [a.length][a[0].length];
      
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=0;j<a[i].length;j++)
    	  {
    		  c[i][j]=a[i][j]+b[i][j];
    	  }
      }
     for(int m=0;m<a.length;m++)
     {
    	 for (int n=0;n<a[m].length;n++)
    	 {
    		System.out.println(c[m][n]); 
    	 }
     }
	}

}
