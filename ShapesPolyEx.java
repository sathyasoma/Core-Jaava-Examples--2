package com.assignments;

/*Write a program to create a class named shape. In this class we have three 
sub classes circle, triangle and square each class has two member function 
named draw () and erase (). 
Create these using polymorphism concepts.*/

class Shape 
{ 
void draw() 
{ 
System.out.println("Shape draw()"); 
} 
void erase() 

{ 
System.out.println (" Shape erase()"); 
} 
} 
class Circle extends Shape 
{ 
void draw() 
{ 
System.out.println ("Circle draw()"); 
} 
void erase() 
{ 
System.out.println ("Circle erase()"); 
} 
} 
class Triangle extends Shape 
{ 
void draw() 
{ 
System.out.println("Triangle erase()"); 
} 
} 
class Square extends Shape 
{ 
void draw() 
{ 
System.out.println ("Square draw()"); 
} 
void erase() 
{ 
System.out.println ("Square erase()"); 
} 
} 
public class ShapesPolyEx {
	public static Shape randshape() 
	 { 
	 switch((int)(Math.random()*3)) 
	 { 
	 case 0: return new Circle(); 
	 case 1: return new Square(); 
	 case 2: return new Triangle(); 
	 default : System.out.println("default"); 
	 return new Shape(); 
	 } 
	} 
	 public static void main (String arg[]) 
	 { 
	 Shape s[] = new Shape[9]; 
	 for(int i = 0;i< s.length; i++) 

	 s[i] = randshape(); 
	 for(int i= 0;i < s.length; i++) 
	 s[i].draw(); 
	 } 
}
