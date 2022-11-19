package com.accesmodifiers;


/*Private member of a base class can be accessed through a public method of the base class which returns the private member.
This is illustrated in the example below:*/
	
	
	
class A {
    private int x;

    public A() {
        x = 10;
    }

    public int getX() {
        return x;
    }
}

class B extends A {
    public void showX() {
        System.out.println("Value of x = " + getX());
    }
}
public class TestPrivateEx {
public static void main(String[] args) {
	
	B test= new B();
	
	test.getX();
	test.showX();
}
}
