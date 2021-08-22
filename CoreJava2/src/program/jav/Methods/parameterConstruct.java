package program.jav.Methods;
    
public class parameterConstruct {
	int id;
    String name;
    public parameterConstruct() {
    
	System.out.println("insider");
}
    
public parameterConstruct(int i,String n) {
	id = i;
	name=n;
	
}
public void display()
{
	System.out.println(id+" "+name);
}


public static void main(String args[]) {
	parameterConstruct s1= new parameterConstruct(111,"Karan");
	parameterConstruct s2= new parameterConstruct(222,"Karan");
	
	s1.display();
	s2.display();
}

}
