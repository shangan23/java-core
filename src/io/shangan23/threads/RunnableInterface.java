package io.shangan23.threads;

public class RunnableInterface implements Runnable {
	
	@Override
	public void run() {
		printTask();
	}
	
	public void printTask() {
		for(int doc=1;doc<10;doc++) {
			System.out.println("++ Printing Documents #"+doc+" Printer 3");
		}
	}


}
