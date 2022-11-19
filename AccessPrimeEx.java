package com.accesmodifiers;

import java.util.Scanner;

/*Write a program by using a class with the following specifications:

Class name — Prime

Data members — private int n

Member functions:

void input() — to input a number
void checkprime() — to check and display whether the number is prime or not
Use a main function to create an object and call member methods of the class.
*/


public class AccessPrimeEx {

private int n;
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = in.nextInt();
    }
    
    public void checkprime() {
        boolean isPrime = true;
        if (n == 0 || n == 1)
            isPrime = false;
        else {
            
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
    
    public static void main(String args[]) {
    	AccessPrimeEx obj = new AccessPrimeEx();
        obj.input();
        obj.checkprime();
    }
}
