package cisco.java.AssistedPractice;

public class Method_Callbyvalue {
	int val=150;

	int operation(int val) 
	{
		val =val*10/100;
		return(val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Callbyvalue d = new Method_Callbyvalue();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		

	}

}
