package cisco.java.assg22;

class AreaOfShapeCODemo
{
	double area;
	AreaOfShapeCODemo()
	{
		System.out.println("Default constructor");
	}
	AreaOfShapeCODemo(float x)
	{
		//area=(x*x);
		System.out.println("the area of square is: "+(x*x)+"sq units");
	}
	
	AreaOfShapeCODemo(float x,float y)
	{
		//area=(x*y);
		System.out.println("the area of rectangle is: "+(x*y)+"sq units");
	}
	
	AreaOfShapeCODemo(double r)
	{
		//area=(3.14*r*r);
		System.out.println("the area of circle is: "+(3.14*r*r)+"sq units");
	}
	
}
public class AreaOfShapeCO
{

	public static void main(String[] args) 
	{
		AreaOfShapeCODemo ob=new AreaOfShapeCODemo();
		AreaOfShapeCODemo ob1=new AreaOfShapeCODemo(5);
		AreaOfShapeCODemo ob2=new AreaOfShapeCODemo(50,60);
		AreaOfShapeCODemo ob3=new AreaOfShapeCODemo(4.5);
		
	}

}