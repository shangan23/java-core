package io.shangan23.threads;

public class SyncApp {
	//Multithreading
	public static void main(String[] args) {
		
		System.out.println(" == Application Started ==");
		
		//Job 1
		Printer printer = new Printer();
		
		MultiThread1 multiThread1 = new MultiThread1(printer);
		multiThread1.start();
		
		// To make this job Synchronized using join()
		// But not feasible way since sharing the same object by multiple thread.
		// Instead there has to a way in the class method implementation itself.
		/*try{
			multiThread1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		Thread multiThread2 = new Thread(new MultiThread2(printer));
		multiThread2.start();
		
		
		System.out.println(" == Application Terminated ==");

	}

}
