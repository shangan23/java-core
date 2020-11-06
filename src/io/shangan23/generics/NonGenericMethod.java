package io.shangan23.generics;

public class NonGenericMethod {
	
	public <E> void printElement(E arr[]) {
		for(E e: arr) {
			System.out.println(e);
		}
	}
}
