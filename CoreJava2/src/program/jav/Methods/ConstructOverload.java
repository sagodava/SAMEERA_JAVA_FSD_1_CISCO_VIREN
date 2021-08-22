package program.jav.Methods;

public class ConstructOverload {
	long id;
	String name;
	int age=10;
	
	ConstructOverload(long i,String n){
		id=i;
		name=n;
	}
	ConstructOverload(int i,String n ,int a){
		id=i;
		name=n;
		age =a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		ConstructOverload s1=new ConstructOverload(111,"Karan");
		ConstructOverload s2=new ConstructOverload(222,"Aryan",25);
		s1.display();
		s2.display();
	}

}
