package cisco.java.FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWrite 
{
 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		try
		{
			FileWriter output=new FileWriter("/Users/sagodava/Desktop/Assignment");
			output.write(st);
			System.out.println("DAta is written to the file");
			output.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}
