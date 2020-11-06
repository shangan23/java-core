package io.shangan23.generics;

public class GenericClassImplements<E> implements InterfaceClass<E> {
	
	private E e;

	@Override
	public void setE(E e) {
		this.e = e;	
	}

	@Override
	public E getE() {
		return e;
	}

}
