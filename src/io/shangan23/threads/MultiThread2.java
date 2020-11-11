package io.shangan23.threads;

public class MultiThread2 implements Runnable {

	Printer pRef;

	MultiThread2(Printer p) {
		this.pRef = p;
	}

	@Override
	public void run() {
		synchronized (pRef) {
			pRef.printDoc(10, "MonishaProfile.pdf");
		}
	}

}
