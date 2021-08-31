package cisco.java.FileHandling;

import java.io.IOException;
import java.io.File;

public class FileInputStream 
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileInputStream fin= new FileInputStream("/Users/sagodava/Desktop/Assignment");
		System.out.println(fin.getChannel());
		System.out.println("Number of byte read:"+fin.available());
		fin.skip(7);
		System.out.println("FileContents:");
		int ch;
		while(ch=fin.read()!=-1)
			System.out.print((char)ch);
		fin.close();
	}

}
