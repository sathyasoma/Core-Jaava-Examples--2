package com.assignments;

//Create a A,B classes and provide some implementation with same methodname in the bothe classes
//try to inherit both classes with another class. use Multiple inheritance.
class A {
void testMethod() {
  System.out.println("I am from class A");
}
}
class B {
void testMethod() {
  System.out.println("I am from class B");
}
}
//Not possible to inherit classes this way But for understanding let us suppose
class C extends  B { //add Class A
void newMethod() {
  System.out.println("I am from subclass");
}
}
public class MultipleEx {
	 public static void main(String args[]) {
		    C obj = new C();
		    obj.testMethod();
		    // Ambiguity here as its present in both A and B class
		  }
}
