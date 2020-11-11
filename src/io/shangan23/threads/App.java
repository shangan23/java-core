package io.shangan23.threads;

public class App {

	// main method represents main thread
	public static void main(String[] args) {
		// implementation in this block will be executed as part of main thread.
		// Sequential operation
		
		// Job 1
		System.out.println(" == Application Started == ");
		
		// Job 2 - Extends thread
		// if this is long running operations; application OS/JVM gives a messages Application is not responding.
		// App might seem to hand; sluggish behavior.
		// So Job 2 needs to be a thread to make it parallel. 		
		ExtendsThread printDoc = new ExtendsThread();
		printDoc.start();
		
		// Job 3 - Implements Runnable
		// if this is long running operations; application OS/JVM gives a messages Application is not responding.
		// App might seem to hand; sluggish behavior.
		// So Job 2 needs to be a thread to make it parallel. 		
		Runnable runnable = new RunnableInterface();
		Thread thread = new Thread(runnable); //Thread thread = new Thread(new RunnableInterface())
		// thread.setDaemon(true); For Daemon thread to run in parallel with Main thread by JVM
		thread.start();
	
		
		// Job 4
		for(int doc=0;doc<10;doc++) {
			System.out.println("^^ Printing Document #"+doc+" Printer 1");
		}

		// Job 5
		System.out.println(" == Application Terminated ==");

	}

}
