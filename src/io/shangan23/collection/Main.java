package io.shangan23.collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	String name;
	int rollno;
}

public class Main {

	public static void main(String[] args) {
		ArrayListClass arrayListClass = new ArrayListClass();
		
		//String Array - Type specific array list.
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Shankar");
		strList.add("Monisha");
		arrayListClass.setStringArray(strList);
		
		//Generic Array - Any type array list.
		ArrayList arrList = new ArrayList();
		
		Student std = new Student();
		std.name = "Shankar";
		std.rollno = 17;
		
		arrList.add(2305);
		arrList.add("Monisha");
		arrList.add(std);
		
		arrayListClass.setGenericArray(arrList);
		
		System.out.println("+++++");
		System.out.println(arrayListClass.getStringArray());
		System.out.println(arrayListClass.getGenericArray());
		System.out.println("+++++");
		
		//Iterating an Array
		for(String str:arrayListClass.getStringArray()) {
			System.out.println("The string item in String array is "+str);
		}
		
		for(Object gArr:arrayListClass.getGenericArray()) {
			System.out.println("The string item in Generic array is "+gArr);
		}
		
		for(int i=0;i<arrayListClass.getStringArray().size();i++) {
			System.out.println("The string item in String array using for loop is "+arrayListClass.getStringArray().get(i));
		}
		
		Iterator strItr = arrayListClass.getStringArray().iterator();
		while(strItr.hasNext()) {
			System.out.println("String array Item: "+ strItr.next());
		}
		Iterator arrItr = arrayListClass.getGenericArray().iterator();
		while(arrItr.hasNext()) {
			System.out.println("Array Item: "+ arrItr.next());
		}
		System.out.println("+++++");
		//get an element
		System.out.println(arrList.get(1));
		System.out.println("+++++");
		//update an element
		arrList.set(1,"Monisha Shankar");
		System.out.println(arrList.get(1));
		System.out.println("+++++");
		//remove an element 
			//arrList.remove(0);
		//removeAll element
			//arrList.clear();
		
		//contains in the array list
			System.out.println(arrList.contains("Monisha Shankar"));

	}

}
