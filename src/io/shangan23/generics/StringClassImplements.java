package io.shangan23.generics;

public class StringClassImplements implements InterfaceClass<String> {
	
	private String e;

	@Override
	public void setE(String e) {
		this.e =e;
	}

	@Override
	public String getE() {
		return e;
	}

}
