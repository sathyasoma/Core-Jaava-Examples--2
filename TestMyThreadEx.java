package com.assignemnts;


/*Write a program to create a class MyThread in this class a constructor, 
call the base class constructor, using super and starts the thread. The run 
method of the class starts after this. It can be observed that both main 
thread and created child thread are executed concurrently.*/




class MyThread extends Thread 
 { 
 MyThread() 
 { 
 super ("Using Thread class"); 
 System.out.println ("Child thread:" + this); 
 start(); 
 } 
 public void run() 
 { 
 try 
 { 
 for ( int i =5; i > 0; i--) 
 { 
 System.out.println ("Child thread" + i); 
 Thread.sleep (500); 
 } 
 } catch (InterruptedException e) { } 
 System.out.println ("exiting child thread …"); 
 } 
 } 
public class TestMyThreadEx {
	public static void main(String args[]) 
	 { 
	 new MyThread(); 
	 try { 
	 for ( int k = 5; k < 0; k--) 
	 { 
	 System.out.println ("Running main thread :" + k); 
	 Thread.sleep(1000); 
	 } 
	 }catch (InterruptedException e) { } 
	 System.out.println ("Exiting main thread . . ."); 
	 } 
}
