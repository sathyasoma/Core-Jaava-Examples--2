package com.assignments;

//Create a Bird ,Parrot,and SingingParrot. Bird class has fly() method with some implementation
//parrot class has whatColorAmI() method with color implementation,
//SingingParrot has whatCanISing() method with some implemntaion, use multilevel inheritance
class Bird1 {
	  void fly() {
	    System.out.println("I am a Bird");
	  }
	}
	class Parrot1 extends Bird {
	  void whatColourAmI() {
	    System.out.println("I am green!");
	  }
	}
	class SingingParrot extends Parrot1 {
	  void whatCanISing() {
	    System.out.println("I can sing Opera!");
	  }
	}
public class MultiEx {
	public static void main(String args[]) {
	    SingingParrot obj = new SingingParrot();
	    obj.whatCanISing();
	    obj.whatColourAmI();
	    obj.fly();
	  }
}
