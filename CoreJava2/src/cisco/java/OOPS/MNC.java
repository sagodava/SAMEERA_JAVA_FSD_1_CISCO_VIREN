package cisco.java.OOPS;

abstract class MNCDemo 
{
	abstract public void method1();
	
	abstract public void method2();
	
	MNCDemo()
	{
		System.out.println(" constructor");
	}
	public void normalMethod()
	{
		System.out.println("inside normal method of MNCDemo class..");
	}
}

abstract class Infosys  extends MNCDemo
{
	public void method1()
	{
		System.out.println("inside abstract method1");
	}
}
class Child extends Infosys
{
	public void method2()
	{
		System.out.println("inside abstract method2");
	}
	public void normalMethod2() 
	{
		System.out.println("inside normal method2 of hello class");
	}
}
public class MNC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child h=new Child();
   
    h.normalMethod2();
    h.method2();
    h.method1();
    h.normalMethod();
    
	}

}
