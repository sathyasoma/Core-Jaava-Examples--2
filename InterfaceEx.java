package com.assignments;

/*Write a program to create interface A in this interface we have two 
method meth1 and meth2. Implements this interface in another class 
named MyClass.*/


//One interface an extend another. 

interface A4 
{ 
void meth1(); 
void meth2(); 
} 
//B now includes meth1() and meth2()--it adds meth3(). 
interface B4 extends A4 
{ 
void meth3(); 
} 
// This class must implement all of A and B 
class MyClass implements B4 
{ 
public void meth1 ( ) 
{ 
System.out.println("Implement meth1()."); 
} 
public void meth2() 
{ 
System.out.println ("Implement meth2()."); 
} 
public void meth3() 
{ 
System.out.println ("Implement meth()." ); 
} 
} 
public class InterfaceEx {
	public static void main(String arg[]) 
	 { 
	 MyClass ob = new MyClass(); 
	 ob.meth1(); 
	 ob.meth2(); 
	 ob.meth3(); 
	 } 
}
