package cisco.java.InnerClass;

public class Static_Nested {
	static int u=90;
	private static void outerMethod()
	{
	System.out.println("inside outerMethod");	
	}
	// A static inner class
	
	static class Inner
	{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("inside inner class method"+u);
			outerMethod();
		}
	}

	

}
