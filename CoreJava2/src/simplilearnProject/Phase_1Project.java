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
		File file = new File("/Users/sagodava/Desktop/Project Folder/Folder");
		Scanner scan=new Scanner(System.in);
		
		String ss[] = file.list();
		
		String st = scan.next();

		String c[] = file.list();
		boolean flag = false;

		for (int i = 0; i < c.length; i++) {

		Object check1 = c[i];
		if (st.equals(check1)) {
		flag = true;
		break;
		}
		}

		if (flag == true)
		System.out.println("File  found sucessfully");
		else
		System.out.println("File doesnt exists");
	}
		
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Project");
		System.out.println("Project Name:- Virtual Key for Your Repositories ");
		System.out.println("Developer Name:- Sameera Godavari");
		System.out.println("Designation:- SDE Trainee");
		System.out.println(" ");
		
		char ch;
		File file = new File("/Users/sagodava/Desktop/Project Folder/Folder");
		if(file.isDirectory())
		{
			List <String>listFile = Arrays.asList(file.list());
			
			Collections.sort(listFile);
			
			System.out.println("Retrieving the file names in  ascending order");
			for(String s:listFile)
			{
				System.out.println(s);
			}
			

		}
		else{
			System.out.println(file.getAbsolutePath() + " is not a directory");
		}
		do{
			
			
            System.out.println("\nFile Operations :");
            System.out.println("1. Add a file");
            System.out.println("2. Delete a file");
            System.out.println("3. Search a file");
            System.out.println("4. Application close");
            System.out.println("Enter your choice: ");
            int ch1 = sc.nextInt();
            switch (ch1)
            {
            
            	
            case 1 :
            	System.out.println("Enter the file name you want to create: ");
            	String n1 = sc.next();
            	try {
            		addmethod(n1);
            	} catch (Exception m) {
            		System.out.println("Exception occured: "+ m.getMessage());
        		}
            	break;
            	
            case 2:
            	System.out.println("Enter the file name you want to delete: ");
            	String d1 = sc.next();
            	try {
            		deletemethod(d1);
            	} catch (Exception m) {
            		System.out.println("Exception occured: "+ m.getMessage());
        		}
            	break;
            	
           
            case 3 :
            	System.out.println("Enter the file to be searched.. ");
            	String s1 = sc.next();
            	try {
            		searchmethod(s1);
            		//sc.searchmethod(sc.next());
            	} catch (Exception m) {
            		System.out.println("Exception occured: "+ m.getMessage());
            	}
            	break;
            	
            case 4 :
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