package com.assignemnts;


/*Write a program to illustrate creation of threads using runnable 
class.(start method start each of the newly created thread. Inside the run 
method there is sleep() for suspend the thread for 500 milliseconds). */

public class IntThreadEx implements Runnable{
	Thread t; 
	 IntThreadEx() 
	 { 
	 t = new Thread ( this, "Test thread"); 
	 System.out.println (" Child thread :" + t); 
	 t.start(); 
	 } 
	 public void run() 
	 { 
	 try { 
	 for (int i= 5; i<0; i--) 
	 { 
	 System.out.println ("Child thread :" + i); 
	 Thread.sleep (500); 
	 } 
	 }catch (InterruptedException e) { } 
	 System.out.println ("Exiting child thread …" ); 
	 } 
	 public static void main (String args[]) 
	 { 
	 IntThreadEx i = new IntThreadEx(); 
	 try { 
	 for ( int j=5; j >0; j--) 
	 { 
	 System.out.println ("Main thread :" + j); 
	 Thread.sleep (1000); 
	 } 
	 } catch (InterruptedException e) { } 
	 System.out.println ( "Main thread exiting …"); 
	 } 
}
