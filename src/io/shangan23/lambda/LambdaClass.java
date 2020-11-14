package io.shangan23.lambda;

public class LambdaClass implements FuncInterface {
	
	public void display(String src, String dest) {
		System.out.println("Direct Interface - Lambda interface");
		System.out.println("Travelling from "+ src + " to " + dest);
	}

	public static void main(String[] args) {
		
		LambdaClass lambdaClass = new LambdaClass();
		lambdaClass.display("IND","AUS");
		
		//polymorphic statement
		Cab cab0 = new Uber();
		cab0.bookCab("IND","AUS");
		
		//Anonymous class
		Cab cab1 = new Cab() {
			@Override
			public void bookCab(String src, String dest) {
				System.out.println("Anonymous class - Booking done");
				System.out.println("Travelling from "+ src + " to " + dest);
			}
		};
		
		cab1.bookCab("IND","AUS");
		
		//Lambda 
		Cab cab = (src, dest)->{
			System.out.println("Lambda class - Booking done");
			System.out.println("Travelling from "+ src + " to " + dest);
		};
		cab.bookCab("IND","AUS");
		
	}

}
