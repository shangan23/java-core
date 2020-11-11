package io.shangan23.threads;

public class Printer {
	
	//synchronized void printDoc(int noOfTimes, String docName)

	 void printDoc(int noOfTimes, String docName) {
		for (int doc = 0; doc < noOfTimes; doc++) {
			System.out.println("Printing " + docName + " " + doc);
		}
	}

}
