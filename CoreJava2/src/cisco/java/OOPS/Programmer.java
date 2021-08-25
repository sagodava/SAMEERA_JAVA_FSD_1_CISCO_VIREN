package cisco.java.OOPS;

class Employee{
	float salary=40000;
	int bonus=5600;
	public void show() {
		System.out.println("inside the parent class");
	}
	public void display() {
		System.out.println("inside display method of parent class");
		
	}
}

public class Programmer extends Employee {
	int bonus=10000;
	public void show() {
		System.out.println("bonus of employee is"+super.bonus);
		System.out.println("inside child class");
	}
	

	public static void main(String[] args) {
		Programmer p=new Programmer();
		System.out.println("Programmer salary is "+p.salary);
		System.out.println("bonus of programmer is"+p.bonus);
	// TODO Auto-generated method stub	
p.show();
	p.display();
	}

}
