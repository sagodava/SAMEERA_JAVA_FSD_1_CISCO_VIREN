package cisco.java.threads;

public class RunnableThread implements Runnable
	{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+"  :"+i);
		}
	}
	public static void main(String[] args) {
		
		RunnableThread m1 =new RunnableThread();
		Thread t1 =new Thread(m1);
		t1.setName("JAVA");
		
		RunnableThread m2 =new RunnableThread();
		Thread t2 =new Thread(m1);
		t2.setName("Python");
		
		RunnableThread m3 =new RunnableThread();
		Thread t3 =new Thread(m1);
		t3.setName("ORACLE");
		
		RunnableThread m4 =new RunnableThread();
		Thread t4 =new Thread(m1);
		t4.setName("C++");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
		System.out.println(t4.getState());
				
	}

}
