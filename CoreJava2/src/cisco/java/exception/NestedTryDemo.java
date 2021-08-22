package cisco.java.exception;

public class NestedTryDemo {
	//public static void ma

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try 
{
	checkException();
	
}
catch(ArithmeticException e) 
	{
	System.out.println("ArithmeticException");
	}
finally 
	{
	System.out.println("Finally outside method");
	}
}
	public static void checkException() {
		try 
		{
			int res=3/0;
		}
		//catch(ArithmeticException)
		finally {
			System.out.println("finally inside method");
		}
	}
}

