package io.shangan23.threads;

public class MultiThread1 extends Thread {
	Printer pRef;
	MultiThread1(Printer p){
		this.pRef = p;
	}
	
	@Override
	public void run() {
		try {
		Thread.sleep(500); // Making the thread Asynchronous
		}catch(Exception e) {
			e.printStackTrace();
		}
		pRef.printDoc(10, "ShankarProfile.pdf");
	}
	
}
