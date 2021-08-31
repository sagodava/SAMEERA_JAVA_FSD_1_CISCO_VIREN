package cisco.java.exception;

class CustomException1 extends Exception
{
	public CustomException1(String x)
	{
		super(x);
	}
	
}

public class Assignment4_1
{
	
	static void validate(int sal) throws CustomException1
	{
		if(sal< 2000) throw new CustomException1("YOU NEED TO WORK HARD");
		
		else if(sal>2100 && sal<5000) throw new CustomException1("your salary is somehow good");
		
		else 
		{
			System.out.println("your salary is very good");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try
		{
			validate(1010);
		}
		catch (CustomException1 e)
		{
			System.out.println(e);
		}
	}

}
