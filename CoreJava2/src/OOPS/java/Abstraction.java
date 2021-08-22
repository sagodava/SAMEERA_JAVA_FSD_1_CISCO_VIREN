package OOPS.java;

abstract class AbstractionDemo
{
	private String name="abc";
	AbstractionDemo()
	{
		System.out.println("inside the abstract class..");
	}
	public void myMethod() 
	{
		System.out.println("Hello.."+ name);
	}
	abstract public void anotherMethod();
}


public class Abstraction extends AbstractionDemo
{
	Abstraction()
	{
		super();
		System.out.println("inside child class");
		
	}
public void anotherMethod()
{
	System.out.println("AbstractMethod  ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionDemo  obj=new Abstraction();
		obj.anotherMethod();
		obj.myMethod();
	}

}
