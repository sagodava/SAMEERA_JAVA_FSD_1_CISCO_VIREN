package cisco.java.assg22;

class AreaOfShapeDemo
{
	void area(float x)
	{
		System.out.println("the area of square is: "+(x*x)+"sq units");
	}
	
	void area(float x,float y)
	{
		System.out.println("the area of rectangle is: "+(x*y)+"sq units");
	}
	
	void area(double r)
	{
		System.out.println("the area of circle is: "+(3.14*r*r)+"sq units");
	}
}
public class AreaOfShape
{

	public static void main(String[] args) 
	{
		AreaOfShapeDemo ob=new AreaOfShapeDemo();
		ob.area(5);
		ob.area(10,20);
		ob.area(2.5);
	}

}
