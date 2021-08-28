package cisco.java.InnerClass;

class Car
{
	String carName;
	String carType;
	
	public Car(String name,String type)
	{
		this.carName=name;
		this.carType=type;
	}
	private String getcarName()
	{
		return this.carName;
	}
	
	class Engine
	{
		String engineType;
		void setEngine()
		{
			if(Car.this.carType.equals("4WD"))
			{
				if(Car.this.getcarName().equals("Crysler"))
				{
					this.engineType="smaller";
				}
				else  
				{
					this.engineType="Bigger";
				}
			}
			else 
			{
				this.engineType="Bigger";
			}
		}
		
		String getEngineType()
		{
			return this.engineType;
		}
	}
	
}
public class Inner_Complex {

	public static void main(String[] args)
	{
		
		Car car1=new Car("Mazda","8WD");
		Car.Engine engine=car1.new Engine();
		engine.setEngine();
		System.out.println("Engine type for 8WD="+ engine.getEngineType());
		
		
		Car car2=new Car("Crysler","4WD");
		Car.Engine c2Engine=car2.new Engine();
		c2Engine.setEngine();
		System.out.println("Engine type for 4WD="+ c2Engine.getEngineType());
		
		
		

	}

}
