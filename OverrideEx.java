package com.assignments;
//Write a program to give the example for method overriding concepts. 


class A2 
{ 
int i, j; 
A2() 
{ 
i = 0; 
j = 0; 
} 
A2(int a, int b) 
{ 
i = a; 
j = b; 
} 
void show() 
{ 

System.out.println ("i and j : " + i +" "+ j); 
} 
} 
class B2 extends A2 
{ 
int k; 
B2() 
{ 
i = 0; 
j = 0; 
k = 0; 
} 
B2(int a, int b, int c) 
{ 
i = a; 
j = b; 
k = c; 
} 
void show() 
{ 
System.out.println ( "i and j : " + i +" " + j ); 
System.out.println (" k:" + k); 
} 
} 
public class OverrideEx {
	public static void main (String args[]) 
	 { 
	 B2 subob = new B2( 1,2,3); 
	 subob.show() ; 
	 }
}
