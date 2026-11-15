package threadsInJava;

import java.util.concurrent.*;

class DownloadTask implements Runnable {
	
	private final String fileName;
	private final int downloadTime;
	
	public DownloadTask(String fileName, int downloadTime)
	{
		this.fileName = fileName;
		this.downloadTime = downloadTime;
	}
	
	@Override
	public void run() {
		
		String threadName = Thread.currentThread().getName();
		
		try
		{
			System.out.println(threadName + " started downloading "+ fileName);
			
			Thread.sleep(downloadTime);
			
			System.out.println(threadName + " completed downloading "+ fileName);
		}
		catch( InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println(fileName + " download interrupted...");
			e.printStackTrace();
		}
		
	}
	
}

public class ConcurrentTasksHandling {
	
	public static void main(String[] args)
	{
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		try {
			executorService.submit(new DownloadTask("Java.pdf",30000));
			executorService.submit(new DownloadTask("Aws.pdf",2000));
			executorService.submit(new DownloadTask("Project.ppt",5000));
			executorService.submit(new DownloadTask("lessons.docx",4000));
			executorService.submit(new DownloadTask("nature.jpeg",1000));
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			executorService.shutdown();
		}
		
		try {
			
			boolean completed = executorService.awaitTermination(10, TimeUnit.SECONDS);
			
			if(completed)
			{
				System.out.println("All the files downloaded successfully!!!");
			}
			else
			{
				executorService.shutdown();
				System.out.println("Some files still downloading...");
			}
			
		}
		catch(InterruptedException e)
		{
			executorService.shutdown();
			Thread.currentThread().interrupt();
		}
		
		
	}
}