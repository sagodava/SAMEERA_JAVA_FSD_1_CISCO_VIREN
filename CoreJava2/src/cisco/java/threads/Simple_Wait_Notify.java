package cisco.java.threads;
class Customer
{
	int amount=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw...");
		if(this.amount<amount)
		{
			System.out.println("Less balance;waiting for deposite....");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
		this.amount-=amount;
		System.out.println("withdraw complete....the left over amount is.."+this.amount);
	}
	synchronized void deposit(int amount)
	{
		System.out.println("going to deposit...");
		this.amount+=amount;
		System.out.println("deposit complete..."+this.amount);
		notify();
	}
}

public class Simple_Wait_Notify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final Customer c=new Customer();
new Thread()
{
	public void run()
	{
		c.withdraw(5000);
	}
}.start();


new Thread()
{
	public void run()
	{
		c.withdraw(4000);
	}
}.start();
new Thread()
{
	public void run()
	{
		c.deposit(20000);
	}
}.start();
new Thread()
{
	public void run()
	{
		c.withdraw(10000);
	}
}.start();



	}

}
