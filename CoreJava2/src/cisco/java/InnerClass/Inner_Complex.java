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
	}
	
}
public class Inner_Complex {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		

	}

}
