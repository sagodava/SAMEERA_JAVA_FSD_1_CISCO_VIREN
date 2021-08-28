package cisco.java.exception;
import java.util.Scanner;

public class ThrowClause {
	static int add(int num1, int num2) {
		if(num1>900)
		{
			throw new ArithmeticException("Num1 > 900 and exception is there");
		}else
		{
			System.out.println("Both parameters are correct");
		}
		return num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result =0;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter num 1:");
		int num1= scanner.nextInt();
		
		System.out.println("Enter num 2:");
		int num2= scanner.nextInt();
		try {
			result =add(num1,num2);
			
		}
		catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("Result is:"+result);
	}

}
