package cisco.java.Assignment26aug;
import java.util.Scanner;


public class Palindrome 
{
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		str=sc.nextLine();
		
		
		for(int i=str.length()-1;i>=0;i--)
			rev=rev+str.charAt(i);
			
			if(str.equals(rev))
				System.out.println("yes");
			else
				System.out.println("No");

	}

}
