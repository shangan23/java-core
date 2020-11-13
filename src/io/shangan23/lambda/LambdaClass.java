package io.shangan23.lambda;

public class LambdaClass implements FuncInterface {
	
	public void display() {
		System.out.println("Lamda output");
	}

	public static void main(String[] args) {
		LambdaClass lambdaClass = new LambdaClass();
		lambdaClass.display();
	}

}
