package io.shangan23.generics;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String
		GenericClass<String> gStr = new GenericClass<String>();
		gStr.setObject("I am a String");
		System.out.println(gStr.getObject());
		
		//Integer
		GenericClass<Integer> iStr = new GenericClass<Integer>();
		iStr.setObject(100);
		System.out.println(iStr.getObject());
		
		//Double
		GenericClass<Double> dStr = new GenericClass<Double>();
		dStr.setObject(2.2);
		System.out.println(dStr.getObject());
		
		//Character
		GenericClass<Character> cStr = new GenericClass<Character>();
		cStr.setObject('A');
		System.out.println(cStr.getObject());


	}

}
