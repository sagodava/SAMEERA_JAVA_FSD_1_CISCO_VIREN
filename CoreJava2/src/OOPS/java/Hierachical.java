package OOPS.java;

class Animal1
{
	void eat() 
	{
		System.out.println("eating...");
	}
}
class Dog1 extends Animal
{
	void bark()
	{
		System.out.println("barking.....");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("meoming.....");
	}
}

public class Hierachical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat C=new Cat();
		C.meow();
		C.eat();
	}

}
