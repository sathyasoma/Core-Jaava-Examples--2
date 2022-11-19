package com.assignments;


/*Create a Bird ,Parrot,and SingingParrot,Crow. Bird class has fly() method with some implementation
parrot class has whatColorAmI() method with color implementation,
SingingParrot has whatCanISing() method with some implemntaion,Crow class use whatColorAmI(), use Hirarchial inheritance*/
class Bird2{
  void fly() {
    System.out.println("I am a Bird");
  }
}
class Parrot2 extends Bird {
  void whatColourAmI() {
    System.out.println("I am green!");
  }
}
class Crow extends Bird2 {
  void whatColourAmI() {
    System.out.println("I am black!");
  }
}
public class HirachialEx {
	public static void main(String args[]) {
	    Parrot par = new Parrot();
	    Crow cro = new Crow();
	    //Call methods of Parrot Class
	    par.whatColourAmI();
	    par.fly();

	    //Call methods of Crow Class
	    cro.whatColourAmI();
	    cro.fly();
	  }
}
