package cisco.java.AssistedPractice;

public class Default_Constructor {
	int id;
	String name;

	void display() 
	{
	System.out.println(id+" "+name);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default_Constructor s=new Default_Constructor();
		Default_Constructor t=new Default_Constructor();
		s.display();
		t.display();
	}

}
