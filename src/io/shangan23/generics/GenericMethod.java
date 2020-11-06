package io.shangan23.generics;

public class GenericMethod<T> {
	
	private T[] arr;
	
	GenericMethod(T[] arr) {
		this.arr =arr;
	}

	public T[] getArr() {
		return arr;
	}

	public <E> void printElement(E arr[]) {
		for(E e: arr) {
			System.out.println(e);
		}
	}
	

}
