package cisco.java.InnerClass;

public class Innerclass {
	
	private int data=30;
	
	void display()
	{
		System.out.println("I am inside the outer class method");
	}
	class Inner
	{
		private int data=50;
		void msg()
		{
			System.out.println("data is "+data);
		}
		void display() {
			System.out.println("I am inside the inner class method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innerclass obj=new Innerclass(); //creating object of outer class
		Innerclass.Inner in=obj.new Inner();   // creating object of inner class
		in.msg();
		in.display();
	}

}
