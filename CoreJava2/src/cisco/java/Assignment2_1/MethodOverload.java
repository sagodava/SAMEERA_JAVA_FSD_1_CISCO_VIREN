package cisco.java.Assignment2_1;

public class MethodOverload {
	
	public void area( int a,int b) 
	{
		System.out.println("Add two numbers : "+(a+b));
	}
	public void area(float r)
	{
		System.out.println("Area of Circle: "+(3.14*r*r));
	}
	public void area(double l,int b)
	{
		System.out.println("Area of Rectangle :"+(l*b));
	}
	

	public static void main(String[] args) {
		MethodOverload ob=new MethodOverload();
		ob.area(1, 1);
		ob.area(10);
		ob.area(2,4);
		
	}

}
