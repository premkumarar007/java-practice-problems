package threadsInJava;

import java.util.*;

public class InterThreadCommunication {
	
	public static final Queue<Integer> queue = new LinkedList<Integer>();
	
	public static final int capacity = 10;
	
	private static final Runnable producer = new Runnable() {
		public void run() {
			while(true) {
				synchronized(queue) {
					while(queue.size() == capacity)
					{
						try {
							System.out.println("Queue is full...");
							queue.wait();
						}
						catch (InterruptedException e){
							e.printStackTrace();
						}
					}
					
					queue.add(10);
					System.out.println("10 added to the queue...");
					queue.notifyAll();
					
					try {
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	};
	
	public static final Runnable consumer = new Runnable() {
		public void run() {
			while(true) {
				synchronized(queue) {
					while(queue.isEmpty())
					{
						try {
							System.out.println("Queue is emptied...");
							queue.wait();
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
					
					System.out.println("Removed "+queue.remove()+" from the queue...");
					queue.notifyAll();
					try {
						Thread.sleep(2000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	};
	
	
	public static void main (String args[]) {
		System.out.println("Main Thread Started now...");
		
		Thread producerThread = new Thread(producer, "Producer");
		Thread consumerThread = new Thread(consumer, "Consumer");
		
		producerThread.start();
		consumerThread.start();
		
		System.out.println("Main Thread Exiting now...");
	}
}