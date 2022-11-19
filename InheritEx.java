package com.assignments;

/*Create class named as ‘a’ and create a sub class ‘b’. Which is extends from 
class ‘a’. And use these classes in ‘inherit’ class.*/ 

class A1 
{ 
int i, j; 
void showij() 
{ 
System.out.println (" i and j: " + i +" "+ j ); 
} 
} 
class B1 extends A1
{ 
int k; 
void showk() 
{ 
System.out.println ( "K: " + k); 
} 
void sum() 
{ 

System.out.println (" i + j + k: " + ( i + j + k ) ); 
} 
} 
public class InheritEx {

	public static void main (String args[]) 
	 { 
	 A1 superOb = new A1(); 
	 B1 subOb = new B1(); 
	 
	 // the superclass may be used by itself 
	 superOb.i = 10; 
	 superOb.j = 20; 
	 System.out.println("Contents of superOb:"); 
	 superOb.showij() ; 
	 System.out.println ( ); 
	//the subclass has access to all public members of its superclass 
	 subOb. i = 1; 
	 subOb. j = 2; 
	 subOb. k = 3; 
	 System.out.println ("Contents of supOb:" ); 
	 subOb.showij ( ) ; 
	 subOb.showk ( ); 
	 System.out.println ( ); 
	 System.out.println ("Sum of i, j and k in subob:" ); 
	 subOb.sum ( ); 
	 }
}
