package cisco.java.Assignment26aug;


abstract  class Pen 
{
	abstract void write();
	abstract void refill();
}
class FountainPen extends Pen
{
	public void write()
	{
		System.out.println("Write");
	}
	public void refill()
	{
		System.out.println("Refill");
	}
	public void changenib()
	{
		System.out.println("changing the nib");
	}
	
	
	class Monkey
	{
		void jump()
		{
			System.out.println("jumping");
		}
		void bite()
		{
			System.out.println("biting");
		}
	}
		
	interface BasicAnimal
		{
			void eat();
			void sleep();
		}
	 class Human extends Monkey implements BasicAnimal
		{
			void speak()
			{
				System.out.println("Hi!!");
		     }
			public void eat()
			{
				System.out.println("eating");
			}
			public void sleep()
			{
				System.out.println("sleeping");
			}
			//@Override
			
	}
	
public class Pen
{
	public  void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FountainPen f=new FountainPen();
		f.changenib();
	
		
		Human h=new Human();
		h.sleep();
		
		Monkey m=new Monkey();
		m.jump();
		m.bite();
		
		BasicAnimal a=new Human();
		a.eat();
		a.sleep();


	}

}
}

