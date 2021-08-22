package OOPS.java;
class Animal
{
	public void eat()
	{
		System.out.println("eat in any ");
		
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking....");
	}
}
class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("weeping....");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d=new BabyDog();
		d.weep();
		d.bark();
		d.eat();

	}

}
