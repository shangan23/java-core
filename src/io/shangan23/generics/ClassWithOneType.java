package io.shangan23.generics;

import java.util.List;

public class ClassWithOneType<T> {
	
	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	

}
