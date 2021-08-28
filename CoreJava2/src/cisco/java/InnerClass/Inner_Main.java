package cisco.java.InnerClass;

class CPU
{
	double price;
	class processor
	{
		double cores;
		String manufacturer;
		
		double getCache()
		{
			return 4.3;
		}
	}
	
	//nested protected class
	protected class RAM
	{
		// members of protected nested class
		double memory;
		String manufacturer;
		
		double getClockspeed()
		{
			return 5.5;
		}
	}
}

public class Inner_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object of outer class cpu
		CPU cpu=new CPU();
		
		//create an object of inner class Processor using outer class
		CPU.processor Processor=cpu.new processor();
		
		// create an object of inner class RAM using outer class cpu
		CPU.RAM ram=cpu.new RAM();
		System.out.println("processor cache="+Processor.getCache());
		System.out.println("RAM clock speed="+ram.getClockspeed());

	}

}
