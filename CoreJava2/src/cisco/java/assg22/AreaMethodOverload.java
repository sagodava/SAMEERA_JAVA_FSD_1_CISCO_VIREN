package cisco.java.assg22;

class AreaMethodOverloadDemo
{
	public void areaShape( float d1,float d2) 
	{
		System.out.println("Area Of Rhombus : "+(d1*d2)/2);
	}
	public void areaShape(int b,int h)
	{
		System.out.println("Area of Triangle: "+(b*h)/2);
	}
}
public class AreaMethodOverload {

	public static void main(String[] args)
	{
		AreaMethodOverloadDemo ob=new AreaMethodOverloadDemo();
		ob.areaShape(20f,30f);
		ob.areaShape(10,20);

	}

}
