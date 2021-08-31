package cisco.java.FileHandling;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;



public class FileOutputStream 
{

	public static void main(String[] args) //throws IOException
	{
		// TODO Auto-generated method stub
		DataInputStream dis=new DataInputStream(System.in);
		
		FileOutputStream fout= new FileOutputStream("/Users/sagodava/Desktop/Assignment",true);
		
		BufferedOutputStream bout= new BufferedOutputStream(fout,1024);
		
		System.out.println("Enter text (@ at the end): ");
		char ch;
		
		while ((ch=(char)dis.read())!='@')
		{
			bout.write(ch);
		}
		bout.close();
	}

}
