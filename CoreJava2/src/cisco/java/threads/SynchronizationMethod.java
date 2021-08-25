package cisco.java.threads;
import java.io.*;
class Line
{
	synchronized public void getLine()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
	}
}

public class SynchronizationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
