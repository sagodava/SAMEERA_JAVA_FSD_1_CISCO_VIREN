package cisco.java.OOPS;

class Vehicle
{
	int speed=5;
	long distance=40;
	 public void run()
	{
		System.out.println("Running...");
	}
	public void stop()
	{
		System.out.println("stopped...");
	}
	public void fuel(int a)
	{
		System.out.println("Value"+a);
	}
	public void fuel(float b, String c)
	{
		System.out.println("Value"+b+" "+c);
	}
	public void fuel(char x,int y)
	{
		System.out.println( +x+" Value "+y);
	}
	Vehicle()
	{
		System.out.println("inside default constructor");
	}
	Vehicle(int a)
	{
		System.out.println("Value"+a);
	}
}

class W2 extends Vehicle
{
	int speed=10;
	long distance=50;
	int no_of_tyre=2;
	public void run()
	{
		System.out.println("Running...");
	}
	public void stop()
	{
		System.out.println("stopped...");
	}
	W2()
	{
		System.out.println("default Constructor");
	}
	
	public void fuel(int a)
	{
		System.out.println("Value"+a);
	}
	public void fuel(float b, String c)
	{
		System.out.println("Value"+b+" "+c);
	}
	public void fuel(char x,int y)
	{
		System.out.println( +x+" Value "+y);
	}
	public void display()
	{
		
		System.out.println("speed="+speed+"Distance= "+distance+"no of tyres="+no_of_tyre);
		System.out.println("Variables of parent class"+super.speed+"  "+super.distance);
	}
}


class W3 extends Vehicle
{	
	int speed=20;
	long distance=60;
	int no_of_tyre=3;
	public void run()
	{
		System.out.println("Running...");
	}
	public void stop()
	{
		System.out.println("stopped...");
	}
	W3()
	{
		System.out.println("default Constructor");
	}
	
	public void fuel(int a)
	{
		System.out.println("Value"+a);
	}
	public void fuel(float b, String c)
	{
		System.out.println("Value"+b+" "+c);
	}
	public void fuel(char x,int y)
	{
		System.out.println( +x+" Value "+y);
	}
	public void display()
	{
		
		System.out.println("speed="+speed+"Distance= "+distance+"no of tyres="+no_of_tyre);
		System.out.println("Variables of parent class"+super.speed+"  "+super.distance);
	}
}


class W4 extends Vehicle
{	
	int speed=30;
	long distance=70;
	int no_of_tyre=4;
	public void run()
	{
		System.out.println("Running...");
	}
	public void stop()
	{
		System.out.println("stopped...");
	}
	W4()
	{
		System.out.println("default Constructor");
	}
	
	public void fuel(int a)
	{
		System.out.println("Value"+a);
	}
	public void fuel(float b, String c)
	{
		System.out.println("Value"+b+" "+c);
	}
	public void fuel(char x,int y)
	{
		System.out.println( +x+" Value "+y);
	}
	public void display()
	{
		
		System.out.println("speed="+speed+"Distance= "+distance+"no of tyres="+no_of_tyre);
		System.out.println("Variables of parent class"+super.speed+"  "+super.distance);
	}
}


class W8 extends Vehicle
{	
	int speed=40;
	long distance=80;
	int no_of_tyre=4;
	public void run()
	{
		System.out.println("Running...");
	}
	public void stop()
	{
		System.out.println("stopped...");
	}
	W8()
	{
		System.out.println("default Constructor");
	}
	
	public void fuel(int a)
	{
		System.out.println("Value"+a);
	}
	public void fuel(float b, String c)
	{
		System.out.println("Value"+b+" "+c);
	}
	public void fuel(char x,int y)
	{
		System.out.println( +x+" Value "+y);
	}
	public void display()
	{
		
		System.out.println("speed="+speed+"Distance= "+distance+"no of tyres="+no_of_tyre);
		System.out.println("Variables of parent class"+super.speed+"  "+super.distance);
	}
}




public class InheretenceVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		v.run();
		v.stop();
		v.fuel(2);
		v.fuel(6,"ABC");
		v.fuel('s',4);
		
		W2 v1=new W2();
		v1.run();
		v1.stop();
		v1.fuel(2);
		v1.fuel(6,"ABC");
		v1.fuel('s',4);
		v1.display();
		
		W3 v2=new W3();
		v2.run();
		v2.stop();
		v2.fuel(2);
		v2.fuel(6,"ABC");
		v2.fuel('s',4);
		
		W4 v3=new W4();
		v3.run();
		v3.stop();
		v3.fuel(2);
		v3.fuel(6,"ABC");
		v3.fuel('s',4);
		
		W8 v4=new W8();
		v4.run();
		v4.stop();
		v4.fuel(2);
		v4.fuel(6,"ABC");
		v4.fuel('s',4);
	}

}
