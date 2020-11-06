package io.shangan23.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generic {

	public static void main(String[] args) {

		// GenericList Example

		GenericList list = new GenericList();
		list.listDemo();
		
		//GenericClass with One type argument
		GenericClassOneType<String> gOneT = new GenericClassOneType<String>();
		List<String> strList= new ArrayList<String>();
		strList.add("GenericClassOneType 1");
		strList.add("GenericClassOneType 1");
		gOneT.setList(strList);
		gOneT.getList().forEach(System.out::println);
		
		GenericClassOneType<Integer> gOneTInt = new GenericClassOneType<Integer>();
		List<Integer> intList= new LinkedList<Integer>();
		intList.add(23);
		intList.add(43);
		gOneTInt.setList(intList);
		gOneTInt.getList().forEach(System.out::println);
		
		//GenericClass with Two types argument
		GenericClassTwoTypes<Integer, String> gTwoTIS = new GenericClassTwoTypes<Integer, String>(100, "One hundered");
		System.out.println(gTwoTIS.getKey() + "=" + gTwoTIS.getVal());
		GenericClassTwoTypes<String, Integer> gTwoTST = new GenericClassTwoTypes<String, Integer>("One hundered",100);
		System.out.println(gTwoTST.getKey() + '-'+ gTwoTST.getVal());	
		
	
		
	}

}
