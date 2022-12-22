package com.wrapper.series.examples;

public class Autoboxing {

	public static void main(String[] args) {
		
		
		int a =10;
		
		Integer i = Integer.valueOf(a); // here converting the int into Integer 
		
		Integer j = a; // autoboxing , now compiler will write Integer.valueOf internall.
		
		System.out.println(a + " " + i + " " + j);
		
		
		

	}

}
