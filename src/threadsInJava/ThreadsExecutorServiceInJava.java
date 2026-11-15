package threadsInJava;

import java.util.concurrent.*;

class Task implements Callable<String> {
	private String message;
	
	public Task(String message)
	{
		this.message = message;
	}
	
	public String call() throws Exception {
		return "Hi! "+this.message;
	}
}

public class ThreadsExecutorServiceInJava {
	
	public static void main(String[] args)
	{
		Task task = new Task("Prem Kumar Sangakkara!");
		
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		Future<String> result = executorService.submit(task);
		
		try {
			System.out.println(result.get());
		}
		catch(InterruptedException | ExecutionException e)
		{
			e.printStackTrace();
		}
		
		executorService.shutdown();
	}
}