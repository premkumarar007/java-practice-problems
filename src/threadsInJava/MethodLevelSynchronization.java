package threadsInJava;

class Counter {
	
	int counter = 0;
	
	//method level synchronization
	public synchronized void incrementCounter()
	{
		counter++;
	}
	
	public int getCounter()
	{
		return counter;
	}
	
}

public class MethodLevelSynchronization {
	
	
	public static void main(String[] args)
	{
		Counter count = new Counter();
		Thread thread1 = new Thread (()->{
			for(int i=0;i<5;i++)
			{
				count.incrementCounter();
			}
		});
		
		Thread thread2 = new Thread (()->{
			for(int i=0;i<5;i++)
			{
				count.incrementCounter();
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Counter Value finally is: "+count.getCounter());
	}
}