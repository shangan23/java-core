package io.shangan23.generics;

public class GenericClassImplementsTwoTypes<E, V> implements InterfaceClass<E> {
	
	private E e;
	private V val;
	
	@Override
	public void setE(E e) {
		this.e = e;
	}
	@Override
	public E getE() {
		return e;
	}
	
	public V getVal() {
		return val;
	}
	public void setVal(V val) {
		this.val = val;
	}

}
