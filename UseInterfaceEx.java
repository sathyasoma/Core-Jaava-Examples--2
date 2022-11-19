
package com.assignments;

//Write a program to give example for multiple inheritance in Java.

class Number1 
 { 
 protected int x; 
 protected int y; 
 } 
interface Arithmetic1 
 { 
 int add(int a, int b); 
 int sub(int a, int b); 
 } 
public class UseInterfaceEx extends Number1 implements Arithmetic1 {
	 public int add(int a, int b) 
	 { 
	 return(a + b); 
	 } 
	public int sub(int a, int b) 
	 { 
	 return (a - b); 
	 } 
	public static void main(String args[]) 
	 { 
	 UseInterfaceEx ui = new UseInterfaceEx(); 
	 System.out.println("Addition --- >" + ui.add(2,3)); 
	 System.out.println("Subtraction ----- >" + ui.sub(2,1)); 
	 } 	

}
