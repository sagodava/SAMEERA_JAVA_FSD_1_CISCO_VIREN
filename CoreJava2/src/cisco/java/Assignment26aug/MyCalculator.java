package cisco.java.Assignment26aug;

import java.util.Scanner;

public class MyCalculator 
{
	
	public   long power(int n,int p) throws Exception
	{
		
		if(n==0 && p==0)
			throw new Exception("n and p should not be zero");
		else if(n<0 || p<0) 
			throw new Exception("n or p should not be negative");
		else
			return(long)(Math.pow(n, p));
	}	

	public static void main(String[] args) 
{
	
	 MyCalculator c1=new MyCalculator();
	  Scanner sc= new Scanner(System.in);

	  System.out.println( "Enter 1st Number");
		int n = sc.nextInt();
		System.out.println( "Enter 2nd Number");
		int p = sc.nextInt();
	  
		  try
		  {
			  System.out.println(c1.power(n, p));
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	
	  
}

}