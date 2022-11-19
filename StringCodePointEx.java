package com.cg.demos;

//Write a Java program to get the character (Unicode code point) at the given index within the String. 

public class StringCodePointEx {

	 public static void main(String[] args) {
		  
		    String str = "sathya";
		    System.out.println("Original String : " + str);
		        
		    // codepoint at index 1
		    int val1 = str.codePointAt(1);
		    
		    // codepoint at index 4
		    int val2 = str.codePointAt(4);
		        
		    // prints character at index1 in string
		    System.out.println("Character(unicode point) = " + val1);
		    // prints character at index9 in string
		    System.out.println("Character(unicode point) = " + val2);
		  }
}
