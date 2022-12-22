package com.wrapper.series.examples;

public class Unboxing {

	public static void main(String[] args) {
		
		Integer a = new Integer(3);
		
		int i =a.intValue(); // here converting Integer into int.
		
		int j=a; // now compiler will write the a.intValue internally, unboxing.
		
		System.out.println(a + " " + i + " " + j);

	}

}
