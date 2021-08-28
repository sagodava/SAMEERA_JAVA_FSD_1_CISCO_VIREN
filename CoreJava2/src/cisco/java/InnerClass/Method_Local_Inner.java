package cisco.java.InnerClass;

class Outer
{
	private int age=90;
	void dis()
	{
		System.out.println("inside dis method");
	}
	void OuterMethod()
	{
		System.out.println("inside outer method");
	
		//Inner class is local to outerMethod
		class Inner
		{
			void innerMethod()
			{
				dis();		//calling the outer class method
				System.out.println("inside inner method"+age);
			}
		}
		Inner y=new Inner();
		y.innerMethod();
	}
}
	

public class Method_Local_Inner
{

	public void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Outer o=new Outer();
		o.OuterMethod();		//calling outer class method
	}

}

