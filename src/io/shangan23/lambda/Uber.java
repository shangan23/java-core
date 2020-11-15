package io.shangan23.lambda;

public class Uber implements Cab {
    public void bookCab(String src,String dest) {
    	System.out.println("Polymorphic statement - Cab Booked! Arriving Soon!");
    	System.out.println("Travelling from "+ src + " to " + dest);
    }
}