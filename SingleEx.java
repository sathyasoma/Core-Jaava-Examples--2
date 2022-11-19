package com.assignments;


//Create a Bird Class and Parrot class,Bird class has fly() method with some implementation
//parrot class has whatColorAmI() method with color implementation, use Single inheritance

class Bird {
void fly() {
  System.out.println("I am a Bird");
}
}
class Parrot extends Bird {
void whatColourAmI() {
  System.out.println("I am green!");
}
}
public class SingleEx {

	public static void main(String args[]) {
	    Parrot obj = new Parrot();
	    obj.whatColourAmI();
	    obj.fly();
	  }
}
