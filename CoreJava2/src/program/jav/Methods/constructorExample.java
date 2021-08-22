package program.jav.Methods;

public class constructorExample {
	int id;
	String name;
	
	public constructorExample()
	{
		id=10;
		name="hello";
		System.out.println(" I am the default constructor");
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        constructorExample s1;
        s1=new constructorExample();
        constructorExample s2=new constructorExample();
        s1.display();
        s2.display();
	}

}
