package io.shangan23.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		
		//GenericClass with One type argument
		System.out.println("===+++++++++++++ Generic Class ++++++++++++++===");
		System.out.println("- GenericClass with One type argument String");
		ClassWithOneType<String> oneTypeString = new ClassWithOneType<String>();
		List<String> stringList= new ArrayList<String>();
		stringList.add("Generic ClassOneType 1");
		stringList.add("Generic ClassOneType 1");
		oneTypeString.setList(stringList);
		Iterator<String> itrOneType = oneTypeString.getList().iterator();
		while(itrOneType.hasNext()) {
			System.out.println(itrOneType.next());
		}
		
		System.out.println("- GenericClass with One type argument Integer");
		ClassWithOneType<Integer> oneTypeInteger = new ClassWithOneType<Integer>();
		List<Integer> integerList= new LinkedList<Integer>();
		integerList.add(23);
		integerList.add(43);
		oneTypeInteger.setList(integerList);
		oneTypeInteger.getList().forEach(System.out::println); // one line foreach statement
		
		System.out.println("- GenericClass with Two type arguments");
		//GenericClass with Two types argument
		ClassWithTwoTypes<Integer, String> twoTypeIntegerString = new ClassWithTwoTypes<Integer, String>(100, "One hundered");
		System.out.println(twoTypeIntegerString.getKey() + "=" + twoTypeIntegerString.getVal());
		ClassWithTwoTypes<String, Integer> twoTypeStringInteger = new ClassWithTwoTypes<String, Integer>("One hundered",100);
		System.out.println(twoTypeStringInteger.getKey() + '='+ twoTypeStringInteger.getVal());	
		
		System.out.println("===+++++++++++++ Generic Interface	 ++++++++++++++===");
		System.out.println("- GenericInterface with Generic Class");
		GenericClassImplements<String> implClass = new GenericClassImplements<String>();
		implClass.setE("This is Interface implementation with one Type with Generic class");
		System.out.println(implClass.getE());
		
		System.out.println("- GenericInterface without Generic Class");
		StringClassImplements stringImplClass = new StringClassImplements();
		stringImplClass.setE("This is Interface implementation with one Type without Generic Class");
		System.out.println(stringImplClass.getE());
		
		System.out.println("- GenericInterface with Generic Class with Two types");
		GenericClassImplementsTwoTypes<String, Double> implClassTwoTypes = new GenericClassImplementsTwoTypes<String,Double>();
		implClassTwoTypes.setE("This is Interface implementation with one Type without Generic Class");
		implClassTwoTypes.setVal(23.23);
		System.out.println(implClassTwoTypes.getE() + "=" + implClassTwoTypes.getVal());
	
		
	}

}
