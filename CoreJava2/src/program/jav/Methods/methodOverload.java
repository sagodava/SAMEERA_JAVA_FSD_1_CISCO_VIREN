package program.jav.Methods;

//import cisco.java.assignment2.MethodOverload;

public class methodOverload {
	public void area(int b,int h)
	{
		System.out.println("area of traiangle:"+ (0.5*b*h));
	}
   public void area(long r) {
	   System.out.println("area of circle "+ (3.14*r*r));
   }
   public void area(float g,int c) {
	   System.out.println("printing the value "+ g +"---"+c);
   }
   public void area(int h,float g ,char m) {
	   System.out.println("print value h"+ h+"---g "+g +"--m"+ m);
   }
   
	public static void main(String[] args) {
		methodOverload ob=new methodOverload();
		ob.area(10.0f,12);
		ob.area(5);
		
		

	}
}
