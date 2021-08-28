package cisco.java.InnerClass;
class Demo
{
	void show()
	{
		System.out.println("I am in show method of super class");
	}
}

public class Anonymous_Inner {
	
	static Demo d=new Demo()
			{
		void show()
		{
			super.show();
			System.out.println("I am in Flavor1Demo class");	
			
		}
			};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d.show();

	}

}
