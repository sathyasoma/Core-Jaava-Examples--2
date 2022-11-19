package com.accesmodifiers;

/*The data members of a class that are declared using the keyword static are called static data members. 
All objects of a class share the same copy of static data members. They are usually accessed using the class name instead of an object.
 Below example shows the use of static data member count to keep the track of the total number of objects created for the class:*/

class StaticExample {
    static int count;
    private String name;

    public StaticExample(String n) {
        name = n;
        count++;
    }

    public void showName() {
        System.out.println(name);
    }
}
public class AccessStaticEx {
	 public static void main(String[] args) {
	        StaticExample obj1 = new StaticExample("Red");
	        StaticExample obj2 = new StaticExample("Blue");
	        StaticExample obj3 = new StaticExample("Green");
	        System.out.println("Total objects of StaticExample class = " + StaticExample.count);
	    }
}
