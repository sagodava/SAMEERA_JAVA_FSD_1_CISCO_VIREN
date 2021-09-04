package simplilearnProject;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Phase_1Project {
	
	//Method for Adding a file
	
	static void addmethod(String n1) throws FileNotFoundException,IOException
	{
		File file = new File("/Users/sagodava/Desktop/Project Folder/Folder"+n1);
		if (file.createNewFile())
			System.out.println("New File is created...");	
		else
			throw new FileNotFoundException("File Already Found");
	}
	
	//Method for Deleting a File
	static void deletemethod(String d1) throws FileNotFoundException
	{
		File file = new File("/Users/sagodava/Desktop/Project Folder/Folder");
		if(file.exists())
		{   file.delete();
			System.out.println(d1+" is deleted");
			}
		else
		{
			 System.out.println("File not found");
		}
	}
	
	//Method for Searching a File
	
	static void searchmethod(String s1) throws FileNotFoundException
	{
		File file = new File("/Users/sagodava/Desktop/Project Folder/Folder/Ravi");
		
		String b[] = file.list();
	   int b1=0;
		
		for (int i = 0; i < b.length-1; i++) 
		{
			
			if (s1.equals(b[i])) 
			{
				b1=i;
				
			}
		}

		if (b1!=0)
			System.out.println("File Found"+b1);
		else
			throw new FileNotFoundException("File Not Found");
		}
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		do{
            System.out.println("\nFile Operations :");
            System.out.println("1. Display all files in ascending order");
            System.out.println("2. Add a file");
            System.out.println("3. Delete a file");
            System.out.println("4. Search a file");
            System.out.println("5. Close the application");
            System.out.println("Enter your choice: ");
            int ch1 = sc.nextInt();
            switch (ch1)
            {
            case 1 :
            	File file = new File("/Users/sagodava/Desktop/Project Folder/Folder");
        		if(file.isDirectory())
        		{
        			List <String>listFile = Arrays.asList(file.list());
        			
        			Collections.sort(listFile);
        			
        			System.out.println("Retrieving the file names in an ascending order");
        			for(String s:listFile)
        			{
        				System.out.println(s);
        			}
        			

        		}
        		else{
        			System.out.println(file.getAbsolutePath() + " is not a directory");
        		}
        		break;
            	
            case 2 :
            	System.out.println("Enter the file name you want to create: ");
            	String n1 = sc.next();
            	try {
            		addmethod(n1);
            	} catch (Exception m) {
            		System.out.println("Exception occured: "+ m.getMessage());
        		}
            	break;
            	
            case 3 :
            	System.out.println("Enter the file name you want to delete: ");
            	String d1 = sc.next();
            	try {
            		deletemethod(d1);
            	} catch (Exception m) {
            		System.out.println("Exception occured: "+ m.getMessage());
        		}
            	break;
            	
           
            case 4 :
            	System.out.println("Enter the file to be searched.. ");
            	String s1 = sc.next();
            	try {
            		searchmethod(s1);
            		//sc.searchmethod(sc.next());
            	} catch (Exception m) {
            		System.out.println("Exception occured: "+ m.getMessage());
            	}
            	break;
            	
            case 5 :
            	sc.close();
            	
            	System.out.println("Closed the Application ");
            	System.exit(ch1);
            	break;
            	
            default :
            	System.out.println("Invalid Choice \nPlease enter valid choice ");
            	break;
            
            }
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = sc.next().charAt(0);

		}while (ch == 'Y'|| ch == 'y');

	}
}

class FileNotFoundException extends Exception {
	FileNotFoundException(String s) {
		super(s);
	}
}