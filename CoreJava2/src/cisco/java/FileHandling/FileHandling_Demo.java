package cisco.java.FileHandling;
import java.io.File;
import java.io.IOException;

public class FileHandling_Demo 
{
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			File file=new File("/Users/sagodava/Desktop/Assignment");
		
			if(file.createNewFile()) 
			{
				System.out.println("New File Created");
			}
		else
		{
			if(file.exists())
			{
				System.out.println("File already exists.");
				System.out.println("File path : " + file.getAbsolutePath());
				System.out.println("File name : " + file.getName());
				System.out.println("File class : "+ file.getClass());
				System.out.println("File space allocated : " + file.getUsableSpace());
				System.out.println("File lenght : " + file.length());
				System.out.println("File list : " +file.list());
				System.out.println("File parent : " +file.getParent());
			}
			else
			{
				System.out.println("File doesnot exists");
			}
			boolean b = file.delete();
			if(b==true)
			{
				System.out.println("File deleted !!");
			}
			else
			{
				System.out.println("File not deleted");
			}
			
	}
		}
catch(IOException e)
		{
	e.printStackTrace();
		}
	}
}
		


