package io.shangan23.generics;

public class GenericClass<T> {
	
	T object;
	
	public T getObject() {
		//System.out.println(object.getClass().getName());
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	

}
