package cisco.java.OOPS;
abstract class Bike
{
	Bike()
	{
		System.out.println("Bike is created");
	}
	abstract void run1();
	void changeGear() 
	{
		System.out.println("gear changed");
	}
}
abstract class Honda extends Bike{
	Honda(){
		System.out.println("honda is created");
	}
	abstract void run();
	abstract void run1();
	}

class Hello extends Honda
{
	void run() {
		System.out.println("running safely...");
	}
	void run1() {
		System.out.println("inside the run1 method");
	}
	}


public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Honda K=new Hello();
K.run();
K.run1();
K.changeGear();
	}

}
