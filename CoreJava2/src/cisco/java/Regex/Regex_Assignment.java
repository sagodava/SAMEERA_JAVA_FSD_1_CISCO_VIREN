package cisco.java.Regex;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Regex_Assignment 
{

	public static void main(String[] args) 
	{
		
		System.out.println(Pattern.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9.]+$","test123prepare@co.edu.com"));
		System.out.println(Pattern.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9.]+$","firstname@gmail.com"));
		System.out.println(Pattern.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9.]+$","virendra@gmail.com"));
		System.out.println("Validate Password");
		System.out.println(Pattern.matches("[A-Z]+\\d{3}[a-zA-Z]*","A234uotdn"));

		//System.out.println(Pattern.matches("^+[0-9]\[0-9]+$"));
		
	}

}


