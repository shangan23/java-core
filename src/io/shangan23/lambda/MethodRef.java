package io.shangan23.lambda;

public class MethodRef {

	public static void main(String[] args) {
		//Method reference 
		Calculator cal = Calc::addInteger;
		cal.add(10,20);
		
		//Instance reference
		Calc calc = new Calc();
		Calculator cal1 = calc::addInt;
		cal1.add(30, 100);
		
		//Constructor Reference
		Message msg = MessageClass::new;
		msg.getMessage("Search the candle rather than cursing the darkness!");
		

	}

}
