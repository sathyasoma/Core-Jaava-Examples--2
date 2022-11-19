package com.cg.eis.exception;

/*Write a program for example of try and catch block. In this check 
whether the given array size is negative or not.*/

public class NegTestEx {

	public static void main(String a[]) 
	 { 
	try 
	 { 
	 int a1[] = new int[-2]; 
	 System.out.println("first element : "+a1[0]); 
	 } 
	 catch(NegativeArraySizeException n) 
	 { 
	 System.out.println(" generated exception : " + n); 
	 } 
	 System.out.println(" After the try block"); 
	 } 
}
