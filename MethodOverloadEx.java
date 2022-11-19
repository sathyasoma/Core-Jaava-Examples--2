package com.assignments;

class Compiletime {
	  // perimeter method with single argument
	  static int perimeter(int a) {
	    return 4 * a;
	  }
	  // perimeter method with two arguments (overloading)
	  static int perimeter(int l, int b) {
	    return 2 * (l + b);
	  }
	}
public class MethodOverloadEx {

	 public static void main(String[] args) {
		    // calling perimeter method by passing single argument 
		    System.out.println("Side of square : 4\nPerimeter of square will be : " + Compiletime.perimeter(4) + "\n");
		    // calling perimeter method by passing two arguments
		    System.out.println("Sides of rectangle are : 10, 13\nPerimeter of rectangle will be : " + Compiletime.perimeter(10, 13));
		  }
}
