package cisco.java.exception;
import java.io.IOException;

public class ThrowsExample {
	void m() throws IOException
	{
		throw new IOException("device error");
	}
	void n() throws IOException
	{
		m();
	}
	void p() {
		try
		{
			n();
		}
		catch (Exception e)
		{
			
			System.out.println("Exception handled");
			System.out.println("e.getMessage()");
			System.out.println("e.getstackTrace()");
			System.out.println("e.getclass()");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowsExample obj=new ThrowsExample();
obj.p();
	}

}
