package com.wrapper.series.examples;

public class Test {

	public static void main(String[] args) {
		
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0f;
		double d = 60.6D;
		char c = 'A';
		boolean b2 = true;
		
		
		// Autoboxing here we converting Primitive data types into objects.
		
		
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean boolobj = b2;
		
		// printing the  objects.
		
		System.out.println("Primitive to Object Value ");
		System.out.println("Byte Object :" + byteobj);
		System.out.println("Short Object :" + shortobj);
		System.out.println("Integer Object :" + intobj);
		System.out.println("Long Object :" + longobj);
		System.out.println("Float Object :" + floatobj);
		System.out.println("Double Object :" + doubleobj);
		System.out.println("Chaaracter Object :" + charobj);
		System.out.println("Boolean Object :" + boolobj);
		
		
		// unboxing here we converting the object into primitive data types.
		
		
		byte bytevalue = byteobj;
		short shortvalue = shortobj;
		int intvalue = intobj;
		long longvalue = longobj;
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		char charvalue = charobj;
		boolean boolvalue = boolobj;
		
		
		// Printing the Primitive types.
		
		System.out.println("object to Primitive Value ");
		System.out.println("Byte Primitive :" + bytevalue);
		System.out.println("Short Primitive :" + shortvalue);
		System.out.println("Integer Primitive :" + intvalue);
		System.out.println("Long Primitive :" + longvalue);
		System.out.println("Float Primitive :" + floatvalue);
		System.out.println("Double Primitive :" + doublevalue);
		System.out.println("Chaaracter Primitive :" + charvalue);
		System.out.println("Boolean Primitive :" + boolvalue);
		
		
		
		
		
		
	}

}
