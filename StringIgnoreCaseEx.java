package com.cg.demos;
//Write a Java program to compare a given string to another string, ignoring case considerations.
public class StringIgnoreCaseEx {
	public static void main(String[] args)
    {
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "stephen edwin king";

        // Test any of the above Strings equal to one another
        boolean equals1 = columnist1.equalsIgnoreCase(columnist2);
        boolean equals2 = columnist1.equalsIgnoreCase(columnist3);

        // Display the results of the equality checks.
        System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist3 + "\"? " + equals2);
    }
}
