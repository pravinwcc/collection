package collection.blockingqueuetest;

import java.util.concurrent.*;

public class BlockingQueueTest {

	public static void main(String[] args) {
		BlockingQueue<String> bQueue = new ArrayBlockingQueue<String>(2);
		try {
			bQueue.put("Java");

			System.out.println("Item 1 inserted into BlockingQueue");
			bQueue.put("JDK");
			System.out.println("Item 2 is inserted on BlockingQueue");
			bQueue.put("J2SE");
			// This line will not execute 
			System.out.println("Done");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
